package com.learn.DSA.Collections;



public class Generic1 {
    public static void main(String[] args) {

        Student student = new Student("A");
        System.out.println(student.getName());
    }
}
class Student<T> {
    T name;

    public Student(T name) {
        this.name = name;
    }
    public T getName() {
        return name;
    }
}