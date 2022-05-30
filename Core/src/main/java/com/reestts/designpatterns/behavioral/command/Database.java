package com.reestts.designpatterns.behavioral.command;

public class Database {

    void insert() {
        System.out.println("Insert record...");
    }

    void select() {
        System.out.println("Select record...");
    }

    void update() {
        System.out.println("Update record...");
    }

    void remove() {
        System.out.println("Remove record...");
    }
}
