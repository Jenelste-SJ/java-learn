package NumberManipulatuation;
//Sum of square of natural numbers

public class Number1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int j=1;j<=10;j++){
            int square = j*j;
            sum += square;
        }
        System.out.println(sum);
    }
}
