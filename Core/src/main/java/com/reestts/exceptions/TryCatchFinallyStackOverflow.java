package com.reestts.exceptions;

public class TryCatchFinallyStackOverflow {

    public static void main(String[] args) {
        try {
            anyProcess();
        } catch (StackOverflowError e) {
            anyProcess();
            System.out.println("StackOverflowError");
        } finally { // call
            System.out.println("Finally");
        }
    }

    private static void anyProcess() {
        anyProcess();
    }
}
