package com.learn.DSA.Collections;

import java.util.HashSet;
import java.util.Objects;

public class HashCode_Equals {
    public static void main(String[] args) {
        Student student1 = new Student(1,"John");
        Student student2 = new Student(1,"John");


        student1.introduce();
        System.out.println(student1);

        student2.introduce();
        System.out.println(student2);

        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        System.out.println(studentSet);

    }
}

class Student{
    int roll;
    String name;


    public Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    public void introduce(){
        System.out.println("Student name: "+name+"\nRoll: "+roll);
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student)obj;
        return name.equals(student.name) && roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,roll);
    }
}

