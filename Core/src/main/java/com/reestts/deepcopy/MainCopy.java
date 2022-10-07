package com.reestts.deepcopy;

public class MainCopy {

    public static void main(String[] args) {
        Engine engine = new Engine(213, "V6");

        Car car = new Car("Ford", "Explorer", engine);
        Car copyCar = new Car(car.getFactory(), car.getModel(), car.getEngine());
        Car deepCopyCar = new Car(car);

        engine.setType("V8");

        System.out.println("object car has V8 engine: " + car.getEngine().getType().equals("V8"));
        System.out.println("object copyCar has V8 engine: " + copyCar.getEngine().getType().equals("V8"));
        System.out.println("object deepCopyCar has V8 engine: " + deepCopyCar.getEngine().getType().equals("V8"));

        System.out.println();

        Car car1 = new Car("Mercury", "Blazer", new Engine(200, "V6"));
        Car car2 = new Car("Mercury", "Blazer", new Engine(200, "V6"));

        System.out.println(car1.equals(car2));
    }
}
