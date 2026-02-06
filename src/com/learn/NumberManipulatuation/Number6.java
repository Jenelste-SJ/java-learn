package com.learn.NumberManipulatuation;
//Fibonacci Series
import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int fib1=0;
        int fib2=1;
        int fib3;
        int i=1;
        System.out.println("The Fibonacci Series is: ");
        while(i<=n){
            System.out.println(fib1);
            fib3=fib1+fib2;
            fib1=fib2;
            fib2=fib3;
            i++;
        }
    }
}
