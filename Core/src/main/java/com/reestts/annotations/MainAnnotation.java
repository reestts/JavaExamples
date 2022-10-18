package com.reestts.annotations;

import java.lang.annotation.Annotation;

public class MainAnnotation {

    public static void main(String[] args) throws ClassNotFoundException {
        Class appleClass = Class.forName("com.reestts.annotations.Apple");
        Annotation annotation = appleClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println("System = " + smartPhone.system() + ". Year = " + smartPhone.yearOfCompany());
    }
}
