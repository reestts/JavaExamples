package com.reestts.spring.introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// using Config2 class
public class TestConfig2 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config2.class);

        Pet cat1 = context.getBean("catBean", Pet.class);

        Person person = context.getBean("personBean", Person.class);

        context.close();
    }
}
