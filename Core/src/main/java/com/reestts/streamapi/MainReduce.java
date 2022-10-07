package com.reestts.streamapi;

import java.util.ArrayList;
import java.util.List;

public class MainReduce {

    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("one");
        listOfString.add("two");
        listOfString.add("three");
        listOfString.add("four");

        String result = listOfString.stream()
                .reduce((accumulator, element) -> accumulator + " " + element)
                .get();
        System.out.println(result);

        String result2 = listOfString.stream()
                .reduce("null", (accumulator, element) -> accumulator + " " + element);
        System.out.println(result2);
    }
}
