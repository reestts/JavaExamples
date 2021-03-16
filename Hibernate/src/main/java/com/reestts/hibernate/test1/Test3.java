package com.reestts.hibernate.test1;

import com.reestts.hibernate.test1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {

    // save table to list
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> list = session.createQuery("from Employee").getResultList();
            for (Employee employee : list) {
                System.out.println(employee);
            }

            session.getTransaction().commit();
        }
    }
}
