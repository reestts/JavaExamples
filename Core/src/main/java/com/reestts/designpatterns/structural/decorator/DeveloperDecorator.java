package com.reestts.designpatterns.structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeveloperDecorator implements Developer{

    Developer developer;

    @Override
    public String writeCode() {
        return developer.writeCode();
    }
}
