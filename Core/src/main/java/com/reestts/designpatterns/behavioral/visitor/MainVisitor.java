package com.reestts.designpatterns.behavioral.visitor;

public class MainVisitor {

    public static void main(String[] args) {

        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Work by junior...");
        project.beWritten(junior);

        System.out.println();

        System.out.println("Work by senior...");
        project.beWritten(senior);
    }
}
