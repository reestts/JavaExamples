package com.reestts.hibernate.basic;

import com.reestts.hibernate.basic.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {

    // delete record
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 3);
            session.delete(employee);

            session.getTransaction().commit();
        }
    }
}
