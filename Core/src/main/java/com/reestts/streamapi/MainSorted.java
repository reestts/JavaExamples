package com.reestts.streamapi;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MainSorted {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("one");
        listOfString.add("two");
        listOfString.add("three");
        listOfString.add("four");

        List<String> listOfString2 = listOfString.stream()
                .sorted()
                .collect(toList());
        System.out.println(listOfString2);
    }
}
