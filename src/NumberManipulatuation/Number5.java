package NumberManipulatuation;

import java.util.Scanner;

//Nth term of a series
public class Number5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int nthTerm = (n*(n+1))/2;
        System.out.println("Nth Term: "+nthTerm);
    }
}
