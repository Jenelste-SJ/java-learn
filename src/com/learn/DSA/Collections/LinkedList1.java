package com.learn.DSA.Collections;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList  list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.addFirst(4);
        list.addLast(5);
        System.out.println(list);

        System.out.println("Remove");
        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println("GET");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(1));

        System.out.println("-----");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(4));
    }
}
