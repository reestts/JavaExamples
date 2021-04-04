package com.reestts.hibernate.manytomany;

import com.reestts.hibernate.manytomany.entity.Child;
import com.reestts.hibernate.manytomany.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();

            Section section1 = new Section("football");
            Child child1 = new Child("Alex", 10);
            Child child2 = new Child("John", 11);
            Child child3 = new Child("Kate", 12);

            section1.addChild(child1);
            section1.addChild(child2);
            section1.addChild(child3);

            session.beginTransaction();
            session.save(section1);
            session.getTransaction().commit();
        }
    }
}
