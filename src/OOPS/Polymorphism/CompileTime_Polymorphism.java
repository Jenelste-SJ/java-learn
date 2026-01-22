package OOPS.Polymorphism;

class Calculator {

    void sum() {
        System.out.println(10 + 20);
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, float b) {
        System.out.println(a + b);
    }

    void sum(float a, int b) {
        System.out.println(a + b);
    }

    void sum(float a, float b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(int a, float b, double c) {
        System.out.println(a + b + c);
    }

    void sum(int a, double b) {
        System.out.println(a + b);
    }

    void sum(double a, int b) {
        System.out.println(a + b);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }
}

public class CompileTime_Polymorphism {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.sum();
        c.sum(30, 40);
        c.sum(30, 68.9f);
        c.sum(88.9f, 68);
    }
}

