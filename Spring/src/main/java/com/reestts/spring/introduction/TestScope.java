package com.reestts.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class TestScope {

    @Transactional
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContextScope.xml");

        Dog dog = context.getBean("dog", Dog.class);
        dog.say();

        context.close();
    }
}
