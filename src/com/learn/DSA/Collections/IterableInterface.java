package com.learn.DSA.Collections;


import java.util.ArrayList;
import java.util.Iterator;

public class IterableInterface {
    public  static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator ite = list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
