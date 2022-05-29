package com.reestts.designpatterns.structural.proxy;

public class MainProxy {

    public static void main(String[] args) {
        Project project = new ProxyProject("http://www.site.com");

        project.run();

    }
}
