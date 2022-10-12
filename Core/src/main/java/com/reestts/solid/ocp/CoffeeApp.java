package com.reestts.solid.ocp;

import static com.reestts.solid.ocp.CoffeeSelection.ESPRESSO;

/**
 * Open Closed Principle (OCP).
 * Software entities (classes, modules, functions, etc.) should be opened to extension but closed to modification.
 * We have one method and some independent implementations for any coffee machines instead many methods
 */
public class CoffeeApp {

    public static void greet(CoffeeMachine coffeeMachine) {
        coffeeMachine.brewCoffee(ESPRESSO);
    }
}
