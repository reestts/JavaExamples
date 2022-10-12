package com.reestts.solid.ocp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasicCoffeeMachine implements CoffeeMachine {

    private BrewingUnit brewingUnit;

    @Override
    public Coffee brewCoffee(CoffeeSelection selection) {
        return brewFilterCoffee();
    }

    private Coffee brewFilterCoffee() {
        return brewingUnit.brew();
    }
}
