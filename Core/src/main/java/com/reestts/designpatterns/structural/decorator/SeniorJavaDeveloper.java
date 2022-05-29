package com.reestts.designpatterns.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String workByMentor() {
        return "Mentoring start...";
    }

    @Override
    public String writeCode() {
        return super.writeCode() + workByMentor();
    }
}
