package com.reestts.lambda;

import java.util.function.UnaryOperator;

public class MainUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));
    }
}