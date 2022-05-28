package com.reestts.streamapi;

import java.util.ArrayList;
import java.util.List;

public class MainForeach {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("one");
        listOfString.add("two");
        listOfString.add("three");
        listOfString.add("four");

        listOfString.stream().forEach(element -> {
            element += " is a number";
            System.out.println(element);
        });
    }
}
