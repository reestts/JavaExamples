package com.reestts.designpatterns.creational.factorymethod;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory factory = create("Java");
        Developer developer = factory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory create(String language) {
        return switch (language) {
            case "Java" -> new JavaDeveloperFactory();
            case "Kotlin" -> new KotlinDeveloperFactory();
            default -> null;
        };
    }
}
