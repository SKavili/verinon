package org.satyam.calm;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        System.out.println("###################################################13"+sessionFactory);

        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        System.out.println("###################################################21"+sessionFactory);
        return sessionFactory;
    }

    public static void shutdown() {
        System.out.println("###################################################26 closed"+sessionFactory);
        getSessionFactory().close();
    }
}
