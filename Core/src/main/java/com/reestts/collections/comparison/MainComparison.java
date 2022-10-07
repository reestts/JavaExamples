package com.reestts.collections.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparison {

    public static void main(String[] args) {
        //default sort
        List<String> listOfString = new ArrayList<>();
        listOfString.add("first");
        listOfString.add("second");
        listOfString.add("third");
        listOfString.add("fourth");
        System.out.println(listOfString + " - before sort");
        Collections.sort(listOfString);
        System.out.println(listOfString + " - after sort");

        System.out.println();

        //sort with Comparable
        List<Employee> listOfEmployee1 = new ArrayList<>();
        Employee employee1 = new Employee(1, "Ivan", 1000);
        Employee employee2 = new Employee(3, "Egor", 1500);
        Employee employee3 = new Employee(2, "Petr", 500);
        listOfEmployee1.add(employee1);
        listOfEmployee1.add(employee2);
        listOfEmployee1.add(employee3);
        System.out.println(listOfEmployee1 + " - before sort");
        Collections.sort(listOfEmployee1);
        System.out.println(listOfEmployee1 + " - after sort");

        System.out.println();

        //sort with Comparator
        List<Employee> listOfEmployee2 = new ArrayList<>();
        Employee employee4 = new Employee(4, "George", 2000);
        Employee employee5 = new Employee(6, "Bob", 3000);
        Employee employee6 = new Employee(5, "Fill", 1000);
        listOfEmployee2.add(employee4);
        listOfEmployee2.add(employee5);
        listOfEmployee2.add(employee6);
        System.out.println(listOfEmployee2 + " - before sort");
        listOfEmployee2.sort(new IdComparator());
        System.out.println(listOfEmployee2 + " - after sort");
    }
}
