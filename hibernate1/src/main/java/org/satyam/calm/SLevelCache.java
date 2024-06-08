package org.satyam.calm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SLevelCache {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
Session session1 = sessionFactory.openSession();
Transaction transaction1 = session1.beginTransaction();

// Load entity from the database and store it in the second-level cache
Dept dept = session1.get(Dept.class, 1l);
System.out.println(dept.getName());

transaction1.commit();
session1.close();

// Open a new session and load the same entity, this time from the second-level cache
Session session2 = sessionFactory.openSession();
Transaction transaction2 = session2.beginTransaction();

Dept dept2 = session2.get(Dept.class, 1l);
System.out.println(dept2.getName());

transaction2.commit();
session2.close();

        
    }
}
