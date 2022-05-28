package com.reestts.designpatterns.creational.abstractfactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();

}
