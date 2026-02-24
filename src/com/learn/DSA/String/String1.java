package com.learn.DSA.String;

import java.util.Arrays;

public class String1 {
    public  static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "Java is a language";

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("");
        }
        System.out.println(str3);
        System.out.println(str1.equals(str2));
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str3.length());
        System.out.println(str3.charAt(0));
        System.out.println(str3.indexOf("a"));
        System.out.println(str3.lastIndexOf("a"));
        char[] arr1 = str2.toCharArray();
        for(char a:arr1){
            System.out.print(a+" ");
        }
        System.out.println();

        String[] arr2 = str3.split(" ");
        for(String s:arr2){
            System.out.print(s+" ");
        }
        System.out.println();

        System.out.println(str3.substring(10));
        System.out.println(str3.substring(0,18));

        // there is no values
        String str4 =new  String("");
        System.out.println(str4.isEmpty());
        System.out.println(str4.isBlank());

        //there is space
        String str5 =new String(" ");
        System.out.println(str5.isEmpty());
        System.out.println(str5.isBlank());
        String str6 = " Java is good ";
        System.out.println(str6.trim());

    }
}
