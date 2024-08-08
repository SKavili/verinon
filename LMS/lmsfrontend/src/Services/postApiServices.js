import { ApiNames } from '../Utils/ApiNames';
const otherOptions = {
    method: "POST",
    headers: {
        'Content-Type': 'application/json',
        authorization: localStorage.getItem("auth")
    },
}


const otherOptionsFile = {
    method: "POST",
    headers: {
        // 'Content-Type': 'application/json',
        authorization: localStorage.getItem("auth")
    },
}
export const loginUser = async (userData) => {
    try {
        const response = await fetch(ApiNames.Login, {
            method: "POST",
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(userData)
        });
        // const responseData = await response.json();
        return response; // Return the response object directly
    } catch (error) {
        console.error('Error during login:', error);
        throw error;
    }
};



export const CreateUser = async (userToPost) => {
    const response = await fetch(ApiNames.Registration, {
        ...otherOptions,
        body: JSON.stringify({ ...userToPost }),
    });
    const responseData = await response.json()
    return { response, responseData };
}

export const CreateCourse = async (courseToPost) => {
    const response = await fetch(ApiNames.Course, {
        ...otherOptions,
        body: JSON.stringify({ ...courseToPost }),
    });
    const responseData = await response.json()
    return { response, responseData };
}


export const CreateTraining = async (trainingToPost) => {
    const response = await fetch(ApiNames.T_Details, {
        ...otherOptions,
        body: JSON.stringify({ ...trainingToPost }),
    });
    const responseData = await response.json()
    return { response, responseData };
}

export const CreateTestManualMcq = async (trainingToPost) => {
    const response = await fetch(ApiNames.CreateTestWithMcq, {
        ...otherOptions,
        body: JSON.stringify({ ...trainingToPost }),
    });
    const responseData = await response.json()
    return { response, responseData };
}
export const CreateTestMcq = async (formData) => {

    const response = await fetch(ApiNames.CreateTestWithMcq, {
        ...otherOptionsFile,
        body: formData, // send FormData directly
    });
    const responseData = await response.json();
    return { response, responseData };
};

export const CreateRole = async (formData) => {
    const response = await fetch(ApiNames.Roles, {
        ...otherOptions,
        body: JSON.stringify({ name: formData.name }) // Ensure JSON.stringify is used
    });
    const responseData = await response.json();
    return { response, responseData };
};

export const UploadMaterial = async (formData) => {
    const response = await fetch(ApiNames.Materials, {
        ...otherOptionsFile,
        body: formData, // send FormData directly
    });
    const responseData = await response.json();
    return { response, responseData };
};

export const ReportsData = async (id, type) => {
    debugger
    const requestOptions = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
            'Authorization': localStorage.getItem("auth") // Assuming "auth" is the key for the authorization token in localStorage
        },
        body: JSON.stringify({ id, type })
    };

    try {
        const response = await fetch(ApiNames.Reports, {
            ...requestOptions,
            ...otherOptions // Merge otherOptions with requestOptions
        });

        const responseData = await response.json();
        return { response, responseData };
    } catch (error) {
        console.error('Error fetching data:', error);
        return { response: null, responseData: null };
    }
};

export const InsertAttendance = async (attendanceRecords) => {
    const response = await fetch(ApiNames.Attendance, {
        ...otherOptions,
        body: JSON.stringify(attendanceRecords), // send FormData directly
    });
    const responseData = await response.json();
    return { response, responseData };
};

export const UploadStudentDocument = async (formData) => {
    const response = await fetch(ApiNames.StudentDocuments, {
        ...otherOptionsFile,
        body: formData, // send FormData directly
    });
    const responseData = await response.json();
    return { response, responseData };
};



export const CreateCompany = async (userToPost) => {
    const response = await fetch(ApiNames.Companies, {
        ...otherOptions,
        body: JSON.stringify({ ...userToPost }),
    });
    const responseData = await response.json()
    return { response, responseData };
}


export const CreateStudentMapping = async (userToPost) => {
    debugger
    const response = await fetch(ApiNames.StudentsMapping, {
        ...otherOptions,
        body: JSON.stringify({ ...userToPost }),
    });
    const responseData = await response.json()
    return { response, responseData };
}

export const SubmitTest = async (formData) => {
    const response = await fetch(ApiNames.TscoresById, {
        ...otherOptions,
        body: JSON.stringify({ ...formData }) // Ensure JSON.stringify is used
    });
    const responseData = await response.json();
    return { response, responseData };
};