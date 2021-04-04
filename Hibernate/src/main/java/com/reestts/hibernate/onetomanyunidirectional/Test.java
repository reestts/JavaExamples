package com.reestts.hibernate.onetomanyunidirectional;

import com.reestts.hibernate.onetomanyunidirectional.entity.Department;
import com.reestts.hibernate.onetomanyunidirectional.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    // add employees to department
    private static final String DEP_NAME = "HR";
    private static final int MIN_SALARY = 500;
    private static final int MAX_SALARY = 2000;

    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();

            Department department = new Department(DEP_NAME, MAX_SALARY, MIN_SALARY);
            Employee employee1 = new Employee("Oleg", "Ivanov", 800);
            Employee employee2 = new Employee("Andrew", "Petrov", 1300);

            department.addEmployeeToDep(employee1);
            department.addEmployeeToDep(employee2);

            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();
        }
    }
}
