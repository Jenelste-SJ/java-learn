package com.learn.DSA.String;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for input string
        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        // Check if the string starts with "Hello"
        System.out.println("Does the string start with \"Hello\"? " + s.startsWith("Hello"));

        // Check if the string ends with "World!"
        System.out.println("Does the string end with \"World!\"? " + s.endsWith("World!"));

        // Check if the string is empty
        System.out.println("Is the string empty? " + s.isEmpty());

        // Check if the string contains only letters using regex
        String regex = "^[a-zA-Z]+$";
        System.out.println("Does the string contain only letters? " + s.matches(regex));

        String regex1 ="[0-9]+";
        System.out.println("Does the string contain only numbers? " + s.matches(regex1));

        String regex2 ="[aeiouAEIOU]+";
        System.out.println("Does the string contain only vowels? " + s.matches(regex2));

        String regex3 ="^a.+";
        System.out.println("Does the string starts with a? " + s.matches(regex3));

        scanner.close();
    }
}
