package com.reestts.spring.introduction;

public class Person {
    private Pet pet;
    private String lastname;
    private int age;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        System.out.println("Class Person : set lastname");
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person : set age");
        this.age = age;
    }

    public Person() {
        System.out.println("Person bean is created");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person : set pet");
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello, my Pet!");
        pet.say();
    }
}
