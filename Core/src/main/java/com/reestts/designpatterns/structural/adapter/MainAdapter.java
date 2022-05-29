package com.reestts.designpatterns.structural.adapter;

public class MainAdapter {

    public static void main(String[] args) {
        Database database = new AdapterJavaToDB();

        database.insert();
        database.select();
        database.update();
        database.remove();
    }
}
