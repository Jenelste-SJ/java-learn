package com.learn.DSA.Collections;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int n1 = sc.nextInt();
                HashSet<Integer> h1 = new HashSet<>();

                for(int i = 0; i < n1; i++){
                    h1.add(sc.nextInt());
                }

                int n2 = sc.nextInt();
                HashSet<Integer> h2 = new HashSet<>();

                for(int i = 0; i < n2; i++){
                    h2.add(sc.nextInt());
                }

                // Find intersection
                h1.retainAll(h2);

                if(h1.isEmpty()){
                    System.out.println("NO COMMON ELEMENTS");
                } else {
                    for(int val : h1){
                        System.out.print(val + " ");
                    }
                }

                sc.close();
            }
        }

