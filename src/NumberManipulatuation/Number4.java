package NumberManipulatuation;

import java.util.Scanner;

//Prime number
public class Number4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPrime = true;
        if(number == 0){
            isPrime = false;
        }
        else {
            for (int i = 2; i < number/2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}
