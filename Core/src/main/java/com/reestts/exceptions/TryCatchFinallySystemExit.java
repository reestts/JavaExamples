package com.reestts.exceptions;

public class TryCatchFinallySystemExit {

    public static void main(String[] args) {
        try {
            System.exit(1);
        } catch (Exception e) {
        } finally { // not call
            System.out.println("Finally");
        }
    }
}
