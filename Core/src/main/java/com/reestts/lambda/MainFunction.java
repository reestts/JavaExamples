package com.reestts.lambda;

import java.util.function.Function;

public class MainFunction {

    public static void main(String[] args) {
        Function<Integer, String> convert = x -> x + " megabyte(s)";
        System.out.println(convert.apply(5));
    }
}
