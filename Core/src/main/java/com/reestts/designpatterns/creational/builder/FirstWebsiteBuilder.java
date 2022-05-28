package com.reestts.designpatterns.creational.builder;

public class FirstWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("First site");
    }

    @Override
    void buildCms() {
        website.setCms(CmsEnum.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(100);
    }
}
