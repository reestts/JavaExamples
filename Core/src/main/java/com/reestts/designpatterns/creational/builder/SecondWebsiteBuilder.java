package com.reestts.designpatterns.creational.builder;

public class SecondWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("Second site");
    }

    @Override
    void buildCms() {
        website.setCms(CmsEnum.JOOMLA);
    }

    @Override
    void buildPrice() {
        website.setPrice(700);
    }
}
