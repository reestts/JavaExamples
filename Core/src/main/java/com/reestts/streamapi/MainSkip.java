package com.reestts.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainSkip {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("one");
        listOfString.add("two");
        listOfString.add("three");
        listOfString.add("four");

        List<String> listOfString2 = listOfString.stream()
                .skip(2).collect(Collectors.toList());
        System.out.println(listOfString2);
    }
}