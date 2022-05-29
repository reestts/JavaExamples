package com.reestts.designpatterns.structural.bridge;

public class SecondApplication extends Application {

    protected SecondApplication(Developer developer) {
        super(developer);
    }

    @Override
    public void developApp() {
        System.out.println("Develop second application");
        developer.writeCode();
    }
}
