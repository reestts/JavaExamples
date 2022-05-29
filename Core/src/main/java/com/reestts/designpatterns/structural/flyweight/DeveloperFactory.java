package com.reestts.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class DeveloperFactory {

    private static final Map<String, Developer> developers = new HashMap<>();

    Developer getDeveloperByLanguage(String language) {
        Developer developer = developers.get(language);

        if (isNull(developer)) {
            switch (language) {
                case "Java" -> developer = new JavaDeveloper();
                case "Kotlin" -> developer = new KotlinDeveloper();
            }
            developers.put(language, developer);
        }
        return developer;
    }
}
