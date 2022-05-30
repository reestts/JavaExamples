package com.reestts.designpatterns.behavioral.iterator;

public class MainIterator {

    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Maven"};

        Developer developer = new Developer("John", skills);

        Iterator iterator = developer.getIterator();

        String output = "";
        while (iterator.hasNext()) {
            output = output.concat(iterator.next() + ", ");
        }
        output = output.substring(0, output.length() - 2);

        System.out.println("Developer with name " + developer.getName() + " has next skills: ");
        System.out.println(output);
    }
}
