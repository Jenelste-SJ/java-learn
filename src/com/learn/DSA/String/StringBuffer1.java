package com.learn.DSA.String;

import java.util.Scanner;

public class StringBuffer1 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer s = new StringBuffer();
        System.out.println("Enter string:");
        String a = sc.next();
        s.append(a);
        System.out.println(s);
        StringBuffer sb = new StringBuffer("Java");
        StringBuffer sb1 = new StringBuffer("Java");

        //equal for StringBuffer
        System.out.println((sb.toString()).equals(sb1.toString()));
        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.capacity());
        sb2.append("Java");
        sb2.append(" Full Stack Programming");
        // Formula: (n*2 + 2)
        // n(ie 16) is the default capacity
        System.out.println(sb2.capacity());

        //insert
        sb.insert(4," Stack Programming");
        System.out.println(sb);
        //delete
        sb.delete(5,sb.length());
        System.out.println(sb);
        //reverse
        sb.reverse();
        System.out.println(sb);
    }
}
