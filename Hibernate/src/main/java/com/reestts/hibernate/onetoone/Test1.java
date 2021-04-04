package com.reestts.hibernate.onetoone;

import com.reestts.hibernate.onetoone.entity.Detail;
import com.reestts.hibernate.onetoone.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    // add Detail as cascade in Employee
    private static final int SALARY = 1000;
    private static final String DEPARTMENT = "security";
    private static final String NAME = "Petr";
    private static final String SURNAME = "Ivanov";

    private static final String CITY = "Moscow";
    private static final String EMAIL = "mail@gmail.com";
    private static final String PHONE_NUMBER = "+7999065";

    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();

            Employee employee = new Employee(NAME, SURNAME, DEPARTMENT, SALARY);
            Detail detail = new Detail(CITY, PHONE_NUMBER, EMAIL);
            employee.setEmpDetail(detail);

            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }
    }
}
