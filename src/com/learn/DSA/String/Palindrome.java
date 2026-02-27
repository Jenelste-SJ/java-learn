package com.learn.DSA.String;

import java.util.Scanner;


// In stringBuffer or stringBuilder there is a reverse function
public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        if (s.equals(reversed)) {
            System.out.println("The string '" + s + "' is a palindrome.");
        } else {
            System.out.println("The string '" + s + "' is not a palindrome.");
        }

        scanner.close();
    }
}
