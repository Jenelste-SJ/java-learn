package com.learn.DSA.Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator1 {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2(1, "Alex");
        Employee2 e2 = new Employee2(2, "Mahi");
        Employee2 e3 = new Employee2(3, "Virat");

        ArrayList<Employee2> emps = new ArrayList<Employee2>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        Collections.sort(emps,new Demo1());
        System.out.println(emps);
        Collections.sort(emps,new Demo2());
        System.out.println(emps);



    }

}

class Employee2 {
    int id;
    String name;
    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Demo1 implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return (o1.name).compareTo(o2.name);
    }


}
class Demo2 implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        if (o1.id < o2.id) {
            return -1;
        }
        else if (o1.id > o2.id) {
            return 1;
        }
        else {
            return 0;
        }
    }
}