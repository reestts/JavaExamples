package com.reestts.designpatterns.behavioral.observer;

public class MainObserver {

    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();

        site.addVacancy("Junior Java Developer");
        site.addVacancy("Middle Java Developer");

        Observer firstSubscriber = new Subscriber("John");
        Observer secondSubscriber = new Subscriber("Bob");

        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);

        site.addVacancy("Senior Java Developer");
        System.out.println();

        site.removeVacancy("Junior Java Developer");
    }
}
