package com.learn.DSA.Array;

import java.util.Scanner;

public class Array_3D_Jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Object creation
        System.out.println("Enter the number of colleges");
        int c = sc.nextInt();
        int[][][] marks = new int[c][][];


        for(int i = 0; i < marks.length; i++){
            System.out.println("Enter the number of classes in college " +(i+1));
            int cl=sc.nextInt();
            marks[i]=new int[cl][];
        }

        for(int i = 0; i < marks.length; i++){
            for(int j = 0; j < marks[i].length; j++){
                    System.out.println("Enter the number students in class" + (j+1) + " of college " + (i+1) + ":");
                    int s= sc.nextInt();
                    marks[i][j] = new int[s];
            }
        }



        // Taking input
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.println("Enter the marks of student " + (k + 1)
                            + " of class " + (j + 1)
                            + " of college " + (i + 1));
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }

        // Printing output
        for (int i = 0; i < marks.length; i++) {
            System.out.println("College " + (i + 1));
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Class " + (j + 1) + ": ");
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.print(marks[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
