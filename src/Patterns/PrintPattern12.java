package Patterns;
/*Alphabet Pattern
A
BB
CCC
DDDD
CCC
BB
A

 */
public class PrintPattern12 {
    public static void main(String[] args) {
        char ch ='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
        ch='C';
        for(int i=3;i>=1;i-- ){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            ch--;
            System.out.println();
        }
    }
}
