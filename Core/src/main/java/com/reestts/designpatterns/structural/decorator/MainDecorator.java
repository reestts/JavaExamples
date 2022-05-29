package com.reestts.designpatterns.structural.decorator;

public class MainDecorator {

    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.writeCode());
    }
}
