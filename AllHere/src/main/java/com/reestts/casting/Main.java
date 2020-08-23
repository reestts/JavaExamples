package com.reestts.casting;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Doctor();   // upcasting
        Doctor doctor = (Doctor) employee;  // downcasting
        // employee and doctor keep references to the same object
    }
}