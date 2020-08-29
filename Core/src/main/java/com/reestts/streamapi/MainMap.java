package com.reestts.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainMap {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("one");
        listOfString.add("two");
        listOfString.add("three");
        listOfString.add("four");

        // without stream
        /*for (int i = 0; i < listOfString.size(); i++) {
            listOfString.set(i, String.valueOf(listOfString.get(i).length()));
        }*/
        // with stream
        //listOfString.stream().map(element -> element.length());

        // collect stream to list
        List<Integer> listOfInteger = listOfString.stream().map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println(listOfInteger);

        // array to stream
        int[] array = {1, 2, 3, 4, 5, 6};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));
    }
}