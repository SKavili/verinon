const express = require('express');
const router = express.Router();
const db = require('../db');
const multer = require('multer');
const fs = require('fs');
const csv = require('csv-parser');
const xlsx = require('xlsx');
const pdfParse = require('pdf-parse');
const mammoth = require('mammoth');
const upload = multer({ dest: 'files/tests/' });
const logger = require('../logger');


/**
 * @swagger
 * tags:
 *   name: Test Master
 *   description: API endpoints for managing test master and MCQ questions
 */
/**
 * @swagger
 * /test-master:
 *   post:
 *     summary: Create a new test master and associated MCQ questions
 *     tags: [Test Master]
 *     requestBody:
 *       required: true
 *       content:
 *         multipart/form-data:
 *           schema:
 *             type: object
 *             properties:
 *               training_id:
 *                 type: integer
 *                 description: The ID of the training
 *               test_name:
 *                 type: string
 *                 description: The name of the test
 *               duration:
 *                 type: integer
 *                 description: The duration of the test in minutes
 *               file:
 *                 type: string
 *                 format: binary
 *                 description: The file containing MCQ questions
 *         application/json:
 *           schema:
 *             type: object
 *             required:
 *               - training_id
 *               - test_name
 *               - duration
 *               - questions
 *             properties:
 *               training_id:
 *                 type: integer
 *                 description: The ID of the training
 *               test_name:
 *                 type: string
 *                 description: The name of the test
 *               duration:
 *                 type: integer
 *                 description: The duration of the test in minutes
 *               questions:
 *                 type: array
 *                 description: Array of MCQ questions
 *                 items:
 *                   type: object
 *                   properties:
 *                     question_text:
 *                       type: string
 *                       description: The text of the question
 *                     option_1:
 *                       type: string
 *                       description: Option 1 for the question
 *                     option_2:
 *                       type: string
 *                       description: Option 2 for the question
 *                     option_3:
 *                       type: string
 *                       description: Option 3 for the question
 *                     option_4:
 *                       type: string
 *                       description: Option 4 for the question
 *                     correct_answer:
 *                       type: string
 *                       description: The correct answer for the question
 *     responses:
 *       201:
 *         description: Test and questions created successfully
 *         content:
 *           application/json:
 *             schema:
 *               type: object
 *               properties:
 *                 message:
 *                   type: string
 *                   example: 'Test and questions created successfully'
 *       400:
 *         description: Bad request
 *       500:
 *         description: Server error
 */

router.post('/', upload.single('file'), async (req, res) => {
    const { training_id, test_name, duration, questions } = req.body;

    try {
        // Insert into test_master table
        const [result] = await db.query(
            'INSERT INTO test_master (training_id, test_name, duration) VALUES (?, ?, ?)',
            [training_id, test_name, duration]
        );

        const test_id = result.insertId;

        // Combine questions from file and JSON payload
        let combinedQuestions = [];

        if (req.file) {
            // File upload case
            const fileExtension = req.file.originalname.split('.').pop().toLowerCase();

            if (fileExtension === 'csv') {
                // Read and parse CSV file
                fs.createReadStream(req.file.path)
                    .pipe(csv())
                    .on('data', (row) => {
                        console.log({ row })
                        combinedQuestions.push([
                            test_id,
                            training_id,
                            row.question_text,
                            row.option_1,
                            row.option_2,
                            row.option_3,
                            row.option_4,
                            row.correct_answer,
                        ]);
                    })
                // .on('end', async () => {
                // Insert questions into mcq_test_questions table
                await insertQuestions(combinedQuestions, res);
                // });
            } else if (fileExtension === 'xlsx') {
                // Read and parse Excel file
                const workbook = xlsx.readFile(req.file.path);
                const sheetName = workbook.SheetNames[0];
                const worksheet = workbook.Sheets[sheetName];
                const rows = xlsx.utils.sheet_to_json(worksheet);

                rows.forEach((row) => {
                    combinedQuestions.push([
                        test_id,
                        training_id,
                        row.question_text,
                        row.option_1,
                        row.option_2,
                        row.option_3,
                        row.option_4,
                        row.correct_answer,
                    ]);
                });

                await insertQuestions(combinedQuestions, res);
            } else if (fileExtension === 'pdf') {
                // Read and parse PDF file
                const dataBuffer = fs.readFileSync(req.file.path);
                const data = await pdfParse(dataBuffer);
                const text = data.text;

                // Example: Extract questions from the text
                // You can implement your logic here

                await insertQuestions(combinedQuestions, res);
            } else if (fileExtension === 'docx') {
                // Read and parse Word document
                const dataBuffer = fs.readFileSync(req.file.path);
                const { value } = await mammoth.extractRawText({ buffer: dataBuffer });
                const text = value;

                // Example: Extract questions from the text
                // You can implement your logic here

                await insertQuestions(combinedQuestions, res);
            } else {
                return res.status(400).json({ error: 'Unsupported file format' });
            }
        } else if (questions && Array.isArray(questions) && questions.length > 0) {
            // Array of questions case
            const formattedQuestions = questions.map((question) => [
                test_id,
                training_id,
                question.question_text,
                question.option_1,
                question.option_2,
                question.option_3,
                question.option_4,
                question.correct_answer,
            ]);

            combinedQuestions = combinedQuestions.concat(formattedQuestions);
            await insertQuestions(combinedQuestions, res);
        } else {
            return res.status(400).json({ error: 'No file or questions provided' });
        }
    } catch (err) {
        console.error(err);
        res.status(500).json({ error: 'Server error' });
    }
});

const insertQuestions = async (questions, res) => {
    try {
        const query = `
            INSERT INTO mcq_test_questions (test_id, training_id, question_text, option_1, option_2, option_3, option_4, correct_answer)
            VALUES ?
        `;
        await db.query(query, [questions]);
        res.status(201).json({ message: 'Test and questions created successfully' });
    } catch (err) {
        console.error(err);
        res.status(500).json({ error: 'Server error' });
    }
};

/**
 * @swagger
 * /test-master:
 *   get:
 *     summary: Get all test master records
 *     tags: [Test Master]
 *     responses:
 *       200:
 *         description: A list of all test master records
 *         content:
 *           application/json:
 *             schema:
 *               type: array
 *               items:
 *                 type: object
 *                 properties:
 *                   test_id:
 *                     type: integer
 *                   training_id:
 *                     type: integer
 *                   test_name:
 *                     type: string
 *                   duration:
 *                     type: integer
 *                   created_at:
 *                     type: string
 *                     format: date-time
 *                   updated_at:
 *                     type: string
 *                     format: date-time
 *       500:
 *         description: Server error
 */

router.get('/', async (req, res) => {
    try {
        const [rows] = await db.query(`
        SELECT 	tm.*
        FROM 	test_master tm`);
        res.json(rows);
    } catch (err) {
        logger.error(err.message, err);
        res.status(500).json({ error: err.message });
    }
});

/**
 * @swagger
 * /test-master/{test_id}:
 *   put:
 *     summary: Update test fields by test ID
 *     tags: [Test Master]
 *     parameters:
 *       - in: path
 *         name: test_id
 *         schema:
 *           type: integer
 *         required: true
 *         description: ID of the test
 *     requestBody:
 *       required: true
 *       content:
 *         application/json:
 *           schema:
 *             type: object
 *             properties:
 *               training_id:
 *                 type: integer
 *                 description: The new value for training_id
 *               test_name:
 *                 type: string
 *                 description: The new value for test_name
 *               from_date:
 *                 type: string
 *                 format: date
 *                 description: The new value for from_date
 *               to_date:
 *                 type: string
 *                 format: date
 *                 description: The new value for to_date
 *               duration:
 *                 type: integer
 *                 description: The new value for duration
 *     responses:
 *       200:
 *         description:  Updated
 *       404:
 *         description: Test not found
 *       500:
 *         description: Server error
 */

router.put('/:test_id', async (req, res) => {
    const { test_id } = req.params;
    const { training_id, test_name, from_date, to_date, duration } = req.body;
    try {
        let updateFields = '';
        const params = [];

        if (training_id !== undefined) {
            updateFields += 'training_id = ?, ';
            params.push(training_id);
        }
        if (test_name !== undefined) {
            updateFields += 'test_name = ?, ';
            params.push(test_name);
        }
        if (from_date !== undefined) {
            updateFields += 'from_date = ?, ';
            params.push(from_date);
        }
        if (to_date !== undefined) {
            updateFields += 'to_date = ?, ';
            params.push(to_date);
        }
        if (duration !== undefined) {
            updateFields += 'duration = ?, ';
            params.push(duration);
        }

        if (!updateFields) {
            return res.status(400).json({ message: 'No fields to update' });
        }

        // Remove trailing comma and space
        updateFields = updateFields.slice(0, -2);

        // Add test_id as the last parameter
        params.push(test_id);

        const query = `UPDATE test_master SET ${updateFields} WHERE test_id = ?`;
        const [result] = await db.query(query, params);

        if (result.affectedRows > 0) {
            res.status(200).json({ message: 'Updated' });
        } else {
            res.status(404).json({ message: 'Test not found' });
        }
    } catch (err) {
        logger.error(err.message, err);
        res.status(500).json({ error: err.message });
    }
});

module.exports = router;
