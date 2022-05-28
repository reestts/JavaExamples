package com.reestts.designpatterns.creational.factorymethod;

public class KotlinDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
