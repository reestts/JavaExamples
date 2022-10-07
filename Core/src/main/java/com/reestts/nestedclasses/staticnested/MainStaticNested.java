package com.reestts.nestedclasses.staticnested;

public class MainStaticNested {

    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(120); // object of static nested class
        Car car = new Car("black", 5, engine);
        Car.Transmission transmission = car.new Transmission("4x4"); // object of non-static nested class
        car.setTransmission(transmission);
    }
}
