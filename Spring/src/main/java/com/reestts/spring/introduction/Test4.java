package com.reestts.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// config with annotation @Component
public class Test4 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContextComponent.xml");

        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();

        context.close();
    }
}
