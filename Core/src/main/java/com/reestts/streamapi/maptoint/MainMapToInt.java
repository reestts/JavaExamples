package com.reestts.streamapi.maptoint;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMapToInt {
    public static void main(String[] args) {
        Car car1 = new Car(120);
        Car car2 = new Car(200);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);

        List<Integer> powerOfCars = cars.stream()
                .mapToInt(element -> element.getPower())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(powerOfCars);
    }
}