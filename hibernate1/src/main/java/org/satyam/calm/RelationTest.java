package org.satyam.calm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
 
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RelationTest {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Create a Course and CourseDetails
        Course course = new Course();
        course.setName("Hibernate Course");

        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setDescription("This is a detailed description of the Hibernate course.");

        course.setCourseDetails(courseDetails);

        // Save the Course (which will also save CourseDetails because of CascadeType.ALL)
        session.save(course);

        transaction.commit();
        session.close();

        // Retrieve and print the Course and its CourseDetails
        session = HibernateUtil.getSessionFactory().openSession();
        Course retrievedCourse = session.get(Course.class, course.getId());
        System.out.println("Course Name: " + retrievedCourse.getName());
        System.out.println("Course Description: " + retrievedCourse.getCourseDetails().getDescription());

        session.close();
    }
}