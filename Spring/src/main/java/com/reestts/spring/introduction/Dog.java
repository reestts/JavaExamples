package com.reestts.spring.introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Bow");
    }

    @PostConstruct
    public void init() {
        System.out.println("Dog init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Dog destroy method");
    }
}
