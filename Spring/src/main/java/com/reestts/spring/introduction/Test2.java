package com.reestts.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// creating with Spring (IoC)
public class Test2 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
