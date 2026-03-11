package com.learn.DSA.Collections;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(30);
        t.add(40);
        t.add(120);
        t.add(75);
        t.add(90);
        t.add(100);
        t.add(50);

        System.out.println(t);

        System.out.println(t.contains(120));
        System.out.println(t.isEmpty());

        t.remove(120);
        t.pollFirst();
        System.out.println(t);

        System.out.println(t.first());
        System.out.println(t.last());

        System.out.println(t.floor(100));
        System.out.println(t.ceiling(100));

        System.out.println(t.higher(100));
        System.out.println(t.lower(100));


    }
}
