package com.learn.DSA.Collections;

import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque a = new ArrayDeque();

        a.add(10);
        a.add(20);
        a.addFirst(30);
        a.addLast(40);

        // add the element only if it has memory space
        a.offerFirst(50);

        System.out.println(a.pollFirst());
        System.out.println(a.pollLast());
        System.out.println(a);
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());
        System.out.println(a);


    }
}
