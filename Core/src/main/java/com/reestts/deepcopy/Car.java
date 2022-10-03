package com.reestts.deepcopy;

public class Car {

    private String factory;
    private String model;
    private Engine engine;

    public Car(final String factory, final String model, final Engine engine) {
        this.factory = factory;
        this.model = model;
        this.engine = engine;
    }

    public Car(Car car) {
        this(car.getFactory(), car.getModel(), new Engine(car.getEngine()));
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(final String factory) {
        this.factory = factory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(final Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "factory='" + factory + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
