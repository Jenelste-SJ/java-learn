package com.learn.DSA.Array;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input rows and columns
        System.out.println("Enter the size of the array");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        // Create matrices
        int[][] arr = new int[row][col];
        int[][] trans = new int[col][row];

        // Input matrix elements

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elements of the array " + (i + 1));
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Print original matrix
        System.out.println("Original Matrix:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate transpose
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                trans[j][i] = arr[i][j];
            }
        }

        // Print transpose
        System.out.println("Transpose of the Matrix:");
        for(int i = 0; i < trans.length; i++) {
            for(int j = 0; j < trans[i].length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
