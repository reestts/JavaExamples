package com.reestts.collections.comparison;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        // long version compare for id
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }

        //short version compare for id:
        //return Integer.compare(this.id, anotherEmp.id);

        //compare for id and name:
        /*
        int result = Integer.compare(this.id, anotherEmp.id);
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
        */
    }
}