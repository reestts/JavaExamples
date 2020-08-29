package com.reestts.streamapi.flatmap;

import java.util.ArrayList;
import java.util.List;

public class MainFlatMap {
    public static void main(String[] args) {
        Cat cat1 = new Cat("sharik");
        Cat cat2 = new Cat("barsik");
        Animal animals = new Animal("Cats");

        animals.addCatToAnimal(cat1);
        animals.addCatToAnimal(cat2);

        List<Animal> list = new ArrayList<>();
        list.add(animals);

        list.stream().flatMap(animal -> animal.getListOfCats()
                .stream()).forEach(element -> System.out.println(element.getName()));
    }
}