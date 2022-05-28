package com.reestts.designpatterns.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Project master = new Project(1, "Base", "source");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterCopy = factory.copyProject();
        System.out.println(masterCopy);
    }
}
