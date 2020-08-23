package com.reestts.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Info<String> infoString = new Info<>("Interstate");
        Info<Integer> infoInteger = new Info<>(60);
        System.out.println(infoString);
        System.out.println(infoInteger);*/

        /*Info2<Integer> info2Integet = new Info2<>(777);
        System.out.println(info2Integet);*/

        /*List<Double> listOfDouble = new ArrayList<>();
        listOfDouble.add(7.7);
        listOfDouble.add(7.8);
        Wildcards.showListInfo(listOfDouble);
        List<Character> listOfChar = new ArrayList<>();
        listOfChar.add('a');
        listOfChar.add('b');
        Wildcards.showListInfo(listOfChar);*/

        ArrayList<Double> list = new ArrayList<>();
        list.add(1.1);
        list.add(1.2);
        System.out.println(Wildcards.sum(list));

        /*Pair<String, Integer> pair = new Pair<>("first", 1);
        System.out.println("value1 = " + pair.getValue1() + ", value2 = " + pair.getValue2());*/

        /*ArrayList<String> listOfString = new ArrayList<>();
        ArrayList<Integer> listOfInteger = new ArrayList<>();
        listOfString.add("first");
        listOfString.add("second");
        listOfInteger.add(1);
        listOfInteger.add(2);
        String s = Method.getSecondElement(listOfString);
        int i = Method.getSecondElement(listOfInteger);
        System.out.println(s);
        System.out.println(i);*/
    }
}