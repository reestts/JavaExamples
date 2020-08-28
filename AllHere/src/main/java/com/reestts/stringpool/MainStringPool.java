package com.reestts.stringpool;

public class MainStringPool {      //How many String-objects were created?
    public static void main(String[] args) {
        String string1 = new String("Privet");      // +1 object
        String string2 = "Privet";                          // +1 object
        System.out.println("Privet");                       // +0 object
        System.out.println("Poka");                         // +1 object
        System.out.println("Poka" == "privet");             // +0 object, +1 object
        String string3 = new String("Privet");      // +1 object
    }
}