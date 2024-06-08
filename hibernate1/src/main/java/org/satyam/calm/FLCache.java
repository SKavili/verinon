package org.satyam.calm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FLCache {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        // Loading the entity for the first time, hits the database
        Employee employee1 = session.get(Employee.class, 22l);
        System.out.println(employee1.getName());
        
        // Loading the same entity again, does not hit the database
        Employee employee2 = session.get(Employee.class, 22l);
        System.out.println(employee2.getName());
        
        transaction.commit();
        session.close();
        
    }
}
