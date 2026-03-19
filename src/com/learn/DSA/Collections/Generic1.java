package com.learn.DSA.Collections;



public class Generic1 {
    public static void main(String[] args) {

        Student1 student = new Student1("A");
        System.out.println(student.getName());
    }
}
class Student1<T> {
    T name;

    public Student1(T name) {
        this.name = name;
    }
    public T getName() {
        return name;
    }
}