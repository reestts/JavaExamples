package com.reestts.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class MainFlyweight {

    public static void main(String[] args) {

        DeveloperFactory factory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(factory.getDeveloperByLanguage("Java"));
        developers.add(factory.getDeveloperByLanguage("Java"));
        developers.add(factory.getDeveloperByLanguage("Java"));
        developers.add(factory.getDeveloperByLanguage("Kotlin"));
        developers.add(factory.getDeveloperByLanguage("Kotlin"));

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
