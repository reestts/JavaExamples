package com.reestts.hibernate.onetoone;

import com.reestts.hibernate.onetoone.entity.Detail;
import com.reestts.hibernate.onetoone.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    // add Employee as cascade in Detail
    private static final int SALARY = 10000;
    private static final String DEPARTMENT = "CEO";
    private static final String NAME = "John";
    private static final String SURNAME = "Wick";

    private static final String CITY = "Paris";
    private static final String EMAIL = "jw@gmail.com";
    private static final String PHONE_NUMBER = "+7999999";

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
            detail.setEmployee(employee);

            session.beginTransaction();
            session.save(detail);
            session.getTransaction().commit();
        }
    }
}
