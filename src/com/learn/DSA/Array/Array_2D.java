package com.learn.DSA.Array;

import java.util.Scanner;
//2D Regular Array
public class Array_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[2][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Mark of Student " +(j+1) +"of "+ (i+1) + " is " + arr[i][j] + "\t");
            }
        }
    }
}
