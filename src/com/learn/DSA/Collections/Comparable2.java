package com.learn.DSA.Collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1> {
    int id;
    String name;
    double salary;
    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public int compareTo(Employee1 emp2) {
        Employee1 emp1 = this;
        String n1 = emp1.name;
        String n2 = emp2.name;
        return n1.compareTo(n2);
    }


}
public class Comparable2 {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1(1, "Alex", 10000);
        Employee1 e2 = new Employee1(2, "Alex", 10000);
        Employee1 e3 = new Employee1(3, "Alex", 10000);

        ArrayList<Employee1> emps = new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        Collections.sort(emps);
        System.out.println(emps);
    }
}
