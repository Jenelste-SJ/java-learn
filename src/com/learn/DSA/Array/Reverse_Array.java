package com.learn.DSA.Array;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int a = scanner.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Original array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


        //Reverse Array
        int[] rev = new int[a];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[j];
            j--;
        }

        System.out.print("Reversed array: [");
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]);
            if (i < rev.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}

