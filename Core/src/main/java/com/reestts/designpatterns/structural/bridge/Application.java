package com.reestts.designpatterns.structural.bridge;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Application {

    protected Developer developer;

    public abstract void developApp();
}
