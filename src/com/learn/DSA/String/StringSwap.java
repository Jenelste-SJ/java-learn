package com.learn.DSA.String;

import java.util.Scanner;

public class StringSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[]  arr1 = str1.split(" ");
        String[]  arr2 = new String[arr1.length];
        int j=arr1.length-1;
        for(int i=0;i<arr1.length;i++){
            arr2[i] =arr1[j];
            j--;
        }
        String str2 = String.join(" ",arr2);
        System.out.println(str2);
    }
}
