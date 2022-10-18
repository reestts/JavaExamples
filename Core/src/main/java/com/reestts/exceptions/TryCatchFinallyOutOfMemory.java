package com.reestts.exceptions;

import java.util.ArrayList;

public class TryCatchFinallyOutOfMemory {

    public static void main(String[] args) {
        try {
            anyProcess();
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError");
        } finally {  // call
            System.out.println("Finally");
        }
    }

    private static void anyProcess() {
        int i = 500;
        var list = new ArrayList<Integer>();
        while (true) {
            list.add(i++);
        }
    }
}
