package com.reestts.designpatterns.behavioral.templatemethod;

public class MainTemplateMethod {

    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        newsPage.showPage();
    }
}
