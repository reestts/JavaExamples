package com.reestts.designpatterns.behavioral.memento;

public class MainMemento {

    public static void main(String[] args) {
        Project project = new Project();
        Repository repository = new Repository();

        System.out.println("Create new project. Version 1.0");
        project.setVersionAndDate("1.0");

        System.out.println("####################### Project params: " + project);

        System.out.println("Save current version");
        repository.setSave(project.save());

        System.out.println("Update project to version 1.1");

        project.setVersionAndDate("1.1");

        System.out.println("####################### Project params: " + project);

        System.out.println("Error, need rollback to previously version");

        project.load(repository.getSave());
        System.out.println("####################### Project params: " + project);
    }
}
