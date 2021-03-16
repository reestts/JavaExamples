package com.reestts.hibernate.test1;

import com.reestts.hibernate.test1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    // find employee by id
    private static final int SALARY = 1500;
    private static final String DEPARTMENT = "sales";
    private static final String NAME = "Oleg";
    private static final String SURNAME = "Ivanov";

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session firstSession = factory.getCurrentSession();
            Employee firstEmployee = new Employee(NAME, SURNAME, DEPARTMENT, SALARY);

            firstSession.beginTransaction();
            firstSession.save(firstEmployee);
            firstSession.getTransaction().commit();

            int myId = firstEmployee.getId();
            Session secondSession = factory.getCurrentSession();
            secondSession.beginTransaction();
            Employee secondEmployee = secondSession.get(Employee.class, myId);
            secondSession.getTransaction().commit();
        }
    }
}
