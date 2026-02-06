package com.learn.OOPS.Interface;

interface MainInterface {
    public  static final int a = 19;
    void display();
    static void display1() {
        System.out.println("display1");
    }
    private void display2() {
        System.out.println("display2");
    }
    default void reCode() {
        System.out.println("In interface default method");
    }
}

class Class1 implements MainInterface {

    @Override
    public void display() {
        System.out.println("In Class1 display");
    }

    @Override
    public void reCode() {
        System.out.println("In Class1 default method");
    }
}

class Class2 implements MainInterface {

    @Override
    public void display() {
        System.out.println("In Class2 display");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        MainInterface c1 = new Class1();
        c1.display();
        c1.reCode();

        MainInterface c2 = new Class2();
        c2.display();
        c2.reCode();
    }
}

