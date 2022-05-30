package com.reestts.designpatterns.behavioral.visitor;

public class JuniorDeveloper implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Write smell code...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Database was dropped...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Create weak test");
    }
}
