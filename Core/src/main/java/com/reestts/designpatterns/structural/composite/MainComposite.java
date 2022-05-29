package com.reestts.designpatterns.structural.composite;

public class MainComposite {

    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDev = new JavaDeveloper();
        Developer secondJavaDev = new JavaDeveloper();
        Developer firstKotlinDev = new KotlinDeveloper();

        team.addDeveloper(firstJavaDev);
        team.addDeveloper(secondJavaDev);
        team.addDeveloper(firstKotlinDev);

        team.createProject();
    }
}
