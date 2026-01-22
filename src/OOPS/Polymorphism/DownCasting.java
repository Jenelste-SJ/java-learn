package OOPS.Polymorphism;

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

        Parent p;

        Child1 c1 = new Child1();
        p = c1;
        p.eat();
        p.readsBook();
        ((Child1) p).swim();

        Child2 c2 = new Child2();
        p = c2;
        p.eat();
        p.readsBook();
        ((Child2) p).dance();
    }
}

