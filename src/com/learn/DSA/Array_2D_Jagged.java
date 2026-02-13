package com.learn.DSA;

import java.util.Scanner;

public class Array_2D_Jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of class");
        int n = sc.nextInt();
        int[][] arr = new int[n][];


        for(int i=0; i<arr.length; i++){
            System.out.println("Enter no. of students in class " + (i+1));
            int s = sc.nextInt();
            arr[i]= new int[s];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the  mark of student " + (j+1) + " of class " + (i+1));
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println("Student marks of class " + (i+1) + " are: ");
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
