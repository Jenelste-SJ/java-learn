package com.learn.DSA.Collections;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(70);
        a.add(90);
        a.add(80);
        a.add(70);
        a.add(90);
        // add with index
        a.add(3,80);
        //update the value
        a.set(1,"SJ");
        //get the value
        System.out.println(a.get(0));
        //find the size
        System.out.println(a.size());
        //remove at an index
        a.remove(2);

        //every value is an object
        for(Object o : a){
            System.out.print(o+" ");
        }

        //new arrayList
        ArrayList a1 = new ArrayList();
        a1.add("hello");
        a1.add("me");

        //add all elements of 2nd arraylist to 1st arrayList
        a1.addAll(a);
        //print
        System.out.println(a);
        System.out.println(a1);
        //check if the value contains
        System.out.println(a1.contains("hello"));
    }
}
