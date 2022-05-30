package com.reestts.designpatterns.behavioral.visitor;

public class SeniorDeveloper implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewrite code after junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fix Database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Create power test");
    }
}
