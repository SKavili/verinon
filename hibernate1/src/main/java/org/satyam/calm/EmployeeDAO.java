package org.satyam.calm;
 

 
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDAO {

    public void saveEmployee(Employee employee) {
        Transaction transaction = null;
        System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV#17 beg"+employee);

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            System.out.println("18*********************************************88");
            transaction = session.beginTransaction();
            System.out.println(transaction.isActive());;
            System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV19 beg"+employee);
            session.save(employee);
        System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV#22 bef"+employee);
           transaction.commit();
            session.close();
        System.out.println("###################################################17 af"+employee);

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }
    }

    public List<Employee> getEmployees() {
        List<Employee> list = null;
                    try {
                        Session session = HibernateUtil.getSessionFactory().openSession() ;
            list =  session.createQuery("from Employee", Employee.class).list();
        }catch(Exception e){

        }
        return list;
    }

    public Employee getEmployee(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Employee.class, id);
        }
    }

    public void updateEmployee(Employee employee) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteEmployee(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Employee employee = session.get(Employee.class, id);
            if (employee != null) {
                session.delete(employee);
               
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}

