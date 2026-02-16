package com.learn.DSA.Array;

import java.util.Scanner;

public class Array_1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        String[] names = new String[n];


        for(int i=0;i<names.length;i++) {
            System.out.println("Enter student "+(i+1)+" name");
            names[i] = sc.next();
        }


        System.out.println("Student names are: ");
        System.out.print("[ ");
        for(String no:names) {
            System.out.print(no +" ");
        }
        System.out.print("]");

    }
}
