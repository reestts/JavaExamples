package com.reestts.spring.introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// using Config1 class
public class TestConfig1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config1.class);

        Person person = context.getBean("personBean", Person.class);
        person.callPet();

        context.close();
    }
}
