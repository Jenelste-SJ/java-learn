package com.learn;

import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = str.replaceAll("[aeiouAEIOU]","%");
        System.out.println(str2);

    }
}
