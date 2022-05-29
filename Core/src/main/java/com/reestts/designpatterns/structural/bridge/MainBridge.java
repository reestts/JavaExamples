package com.reestts.designpatterns.structural.bridge;

public class MainBridge {

    public static void main(String[] args) {
        Application[] applications = {
                new FirstApplication(new JavaDeveloper()),
                new SecondApplication(new KotlinDeveloper())
        };

        for (Application application : applications) {
            application.developApp();
        }
    }
}
