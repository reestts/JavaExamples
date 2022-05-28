package com.reestts.designpatterns.creational.abstractfactory;

public class PM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Manage project...");
    }
}
