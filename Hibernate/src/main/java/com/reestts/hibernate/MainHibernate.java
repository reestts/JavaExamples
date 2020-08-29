package com.reestts.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class MainHibernate {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSession()) {
            session.beginTransaction();

            Employee employee = new Employee();
            employee.setName("Vasya");
            employee.setSalary(100);
            session.save(employee);

            employee = new Employee();
            employee.setName("Petya");
            employee.setSalary(200);
            session.save(employee);
            session.getTransaction().commit();
        } catch (Throwable cause) {
            cause.printStackTrace();
        }

        List<Employee> list = null;

        try (Session session = HibernateUtil.getSession()) {
            session.beginTransaction();

            Query query = session.createQuery("FROM Employee");
            list = (List<Employee>) query.list();

            session.getTransaction().commit();
        } catch (Throwable cause) {
            cause.printStackTrace();
        }

        if (list != null && !list.isEmpty()) {
            for (Employee employee : list) {
                System.out.println(employee);
            }
        }
    }
}