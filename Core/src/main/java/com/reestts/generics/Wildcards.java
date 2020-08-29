package com.reestts.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    static void showListInfo(List<?> list) {
        System.out.println(list);
    }

    static double sum(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}