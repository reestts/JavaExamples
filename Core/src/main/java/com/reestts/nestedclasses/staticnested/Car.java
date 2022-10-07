package com.reestts.nestedclasses.staticnested;

public class Car {

    String color;
    int doorCount;
    Engine engine;
    Transmission transmission;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                ", transmission=" + transmission +
                '}';
    }

    public static class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    public class Transmission {
        String type;

        public Transmission(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Transmission{" +
                    "type='" + type + '\'' +
                    '}';
        }
    }
}
