package com.reestts.spring.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook() {
        System.out.println("method get book was invoke");
    }
}
