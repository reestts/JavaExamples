package com.reestts.solid.ocp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PremiumCoffeeMachine implements CoffeeMachine {

    private Grinder grinder;
    private BrewingUnit brewingUnit;

    @Override
    public Coffee brewCoffee(CoffeeSelection selection) {
        return switch (selection) {
            case ESPRESSO -> brewEspresso();
            case FILTER_COFFEE -> brewFilterCoffee();
        };
    }

    private Coffee brewEspresso() {
        grinder.grind();
        return brewingUnit.brew();
    }

    private Coffee brewFilterCoffee() {
        return brewingUnit.brew();
    }
}
