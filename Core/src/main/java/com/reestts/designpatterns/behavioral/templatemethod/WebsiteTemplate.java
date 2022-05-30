package com.reestts.designpatterns.behavioral.templatemethod;

public abstract class WebsiteTemplate {

    void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    abstract void showPageContent();

}
