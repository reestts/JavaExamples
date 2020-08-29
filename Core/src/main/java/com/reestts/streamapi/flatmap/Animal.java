package com.reestts.streamapi.flatmap;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    String name;
    List<Cat> listOfCats;

    public Animal(String name) {
        this.name = name;
        listOfCats = new ArrayList<>();
    }

    public List<Cat> getListOfCats() {
        return listOfCats;
    }

    public void addCatToAnimal(Cat cat) {
        listOfCats.add(cat);
    }
}