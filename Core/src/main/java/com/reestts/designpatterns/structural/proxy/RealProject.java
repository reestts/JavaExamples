package com.reestts.designpatterns.structural.proxy;

public class RealProject implements Project {

    private String url;

    RealProject(String url) {
        this.url = url;
        load();
    }

    void load() {
        System.out.println("Loading project from url = " + url);
    }

    @Override
    public void run() {
        System.out.println("Run project...");
    }
}
