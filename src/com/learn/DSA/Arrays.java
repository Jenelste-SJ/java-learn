package com.learn.DSA;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students whose marks need to be stored");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter students marks");

        //length keyword
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The students marks are");

        //for each loop
        for (int i: arr) {
            System.out.print(arr[i] + " ");
        }
    }
}
