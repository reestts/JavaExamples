package com.reestts.designpatterns.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String increasePerformance() {
        return "Performance test start...";
    }

    @Override
    public String writeCode() {
        return super.writeCode() + increasePerformance();
    }
}
