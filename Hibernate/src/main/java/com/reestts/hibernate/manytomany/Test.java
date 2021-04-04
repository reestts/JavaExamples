package com.reestts.hibernate.manytomany;

import com.reestts.hibernate.basic.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    // add record to table
    private static final int SALARY = 1000;
    private static final String DEPARTMENT = "security";
    private static final String NAME = "Petr";
    private static final String SURNAME = "Ivanov";

    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();

            Employee employee = new Employee(NAME, SURNAME, DEPARTMENT, SALARY);

            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }
    }
}
