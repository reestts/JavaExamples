package com.reestts.designpatterns.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {

        ProjectTeamFactory factory = new ProjectTeamFactoryImpl();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        ProjectManager manager = factory.getProjectManager();

        System.out.println("Create application...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
