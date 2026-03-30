package com.learn.DSA.Collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public int compareTo(Employee emp2) {
        Employee emp1 = this;
        Integer id1=emp1.id;
        Integer id2=emp2.id;
        return id1.compareTo(id2);
//        if(id1>id2) {
//            return 1;
//        }
//        else if(id1<id2) {
//            return -1;
//        }
//        else {
//            return 0;
//        }
    }


}
public class Comparable1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Alex", 10000);
        Employee e2 = new Employee(2, "Alex", 10000);
        Employee e3 = new Employee(3, "Alex", 10000);

        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        Collections.sort(emps);
        System.out.println(emps);
    }
}
