package com.reestts.deepcopy;

public class MainCar {

    public static void main(String[] args) {
        Engine engine = new Engine(213, "V6");

        Car car = new Car("Ford", "Explorer", engine);
        Car copyCar = new Car(car.getFactory(), car.getModel(), car.getEngine());
        Car deepCopyCar = new Car(car);

        engine.setType("V8");

        System.out.println(car.getEngine().getType().equals("V8"));
        System.out.println(copyCar.getEngine().getType().equals("V8"));
        System.out.println(deepCopyCar.getEngine().getType().equals("V6"));

    }
}
