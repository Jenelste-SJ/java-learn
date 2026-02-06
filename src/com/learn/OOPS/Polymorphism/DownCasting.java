package com.learn.OOPS.Polymorphism;

class Parent {

    void readsBook() {
        System.out.println("Reads book");
    }

    void eat() {
        System.out.println("Eats veg");
    }
}

class Child1 extends Parent {

    @Override
    void eat() {
        System.out.println("Eats South Indian food");
    }

    void swim() {
        System.out.println("Know how to swim");
    }
}

class Child2 extends Parent {

    @Override
    void eat() {
        System.out.println("Eats North Indian food");
    }

    void dance() {
        System.out.println("Know how to dance");
    }
}

public class DownCasting {

    public static void main(String[] args) {

        Child1 c1 = new Child1();
        display(c1);

        Child2 c2 = new Child2();
        display(c2);
    }

    public static void display(Parent p) {

        p.eat();
        p.readsBook();

        if (p instanceof Child1) {
            ((Child1) p).swim();
        } else {
            ((Child2) p).dance();
        }
    }
}


