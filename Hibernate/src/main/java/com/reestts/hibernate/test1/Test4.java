package com.reestts.hibernate.test1;

import com.reestts.hibernate.test1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {

    // update field value
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);
            employee.setSalary(1750);

            session.createQuery("update Employee set department = 'security' where id = 4").executeUpdate();

            session.getTransaction().commit();
        }
    }
}
