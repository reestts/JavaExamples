package com.reestts.lambda;

import java.util.function.Consumer;

public class MainConsumer {

    public static void main(String[] args) {
        Consumer<Integer> printer = x -> System.out.printf("%d megabyte(s) \n", x);
        printer.accept(1024);
    }
}
