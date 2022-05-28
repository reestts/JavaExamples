package com.reestts.designpatterns.creational.abstractfactory;

public class ProjectTeamFactoryImpl implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PM();
    }
}
