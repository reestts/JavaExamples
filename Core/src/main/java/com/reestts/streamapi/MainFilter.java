package com.reestts.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("one");
        listOfString.add("two");
        listOfString.add("three");
        listOfString.add("four");

        listOfString = listOfString.stream().filter(element ->
                element.length() > 3).collect(Collectors.toList());

        System.out.println(listOfString);
    }
}