package com.reestts.designpatterns.structural.bridge;

public class FirstApplication extends Application {

    protected FirstApplication(Developer developer) {
        super(developer);
    }

    @Override
    public void developApp() {
        System.out.println("Develop first application");
        developer.writeCode();
    }
}
