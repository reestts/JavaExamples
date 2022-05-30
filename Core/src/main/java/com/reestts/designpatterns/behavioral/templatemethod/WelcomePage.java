package com.reestts.designpatterns.behavioral.templatemethod;

public class WelcomePage extends WebsiteTemplate{

    @Override
    void showPageContent() {
        System.out.println("Welcome");
    }
}
