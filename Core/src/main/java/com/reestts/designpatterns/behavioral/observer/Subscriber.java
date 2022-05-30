package com.reestts.designpatterns.behavioral.observer;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Subscriber implements Observer {

    private String name;

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println(name + ", you can apply for these vacancies: " + vacancies);
    }
}
