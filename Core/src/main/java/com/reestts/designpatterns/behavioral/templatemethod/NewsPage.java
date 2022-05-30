package com.reestts.designpatterns.behavioral.templatemethod;

public class NewsPage extends WebsiteTemplate{

    @Override
    void showPageContent() {
        System.out.println("News");
    }
}
