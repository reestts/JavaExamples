package com.reestts.annotation;

import java.lang.annotation.Annotation;

public class MainAnnotation {

    public static void main(String[] args) throws ClassNotFoundException {
        Class appleClass = Class.forName("com.reestts.annotation.Apple");
        Annotation annotation = appleClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println("System = " + smartPhone.system() + ". Year = " + smartPhone.yearOfCompany());
    }
}
