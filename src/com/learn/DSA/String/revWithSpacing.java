package com.learn.DSA.String;

import java.util.Scanner;

public class revWithSpacing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        char[] arr2 = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ' '){
                arr2[i] = ' ';
            }
        }

        int i = arr.length - 1;
        for(int j = 0; j < arr2.length; j++){
            if(arr2[j] == ' '){
                j++;
            }
            if(arr[i]==' '){
                i--;
            }
            arr2[j] =arr[i];
            i--;
        }
        String str = new String(arr2);
        System.out.println(str);
    }
}
