package com.reestts.designpatterns.creational.builder;

public class MainBuilder {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new FirstWebsiteBuilder());

        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
