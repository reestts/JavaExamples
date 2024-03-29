package com.reestts.hibernate.basic;

import com.reestts.hibernate.basic.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {

    // save table to list
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            List<Employee> list = session.createQuery("from Child").getResultList();
            for (Employee employee : list) {
                System.out.println(employee);
            }

            session.getTransaction().commit();
        }
    }
}
