package com.learn.DSA.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static   void main(String[] args){
        Queue q = new LinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q);
        //poll removes the first element
        System.out.println(q.poll());
        System.out.println(q);

        //get the first element
        System.out.println(q.peek());
        System.out.println(q);
    }
}
