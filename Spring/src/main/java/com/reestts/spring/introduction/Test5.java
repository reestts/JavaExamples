package com.reestts.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// using annotation @Autowired
public class Test5 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContextComponent.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callPet();

        context.close();
    }
}
