package com.learn.DSA.String;

public class StringBuffer1 {
    public  static void main(String[] args) {
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
    }
}
