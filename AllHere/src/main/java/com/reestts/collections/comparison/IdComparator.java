package com.reestts.collections.comparison;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.id == employee2.id) {
            return 0;
        } else if (employee1.id < employee2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}