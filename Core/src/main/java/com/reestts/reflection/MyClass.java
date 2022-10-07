package com.reestts.reflection;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MyClass {

    private int number;
    private String type;
    private String secret;

    public void updateType() {
        type = type + type;
    }
}
