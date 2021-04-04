package com.reestts.hibernate.onetomanybidirectional;

import com.reestts.hibernate.onetomanybidirectional.entity.Department;
import com.reestts.hibernate.onetomanybidirectional.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    // add employees to department
    private static final String DEP_NAME = "security";
    private static final int MIN_SALARY = 1000;
    private static final int MAX_SALARY = 1500;

    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();

            Department department = new Department(DEP_NAME, MAX_SALARY, MIN_SALARY);
            Employee employee1 = new Employee("Ivan", "Ivanov", 1200);
            Employee employee2 = new Employee("Petr", "Petrov", 1400);

            department.addEmployee(employee1);
            department.addEmployee(employee2);

            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();
        }
    }
}
