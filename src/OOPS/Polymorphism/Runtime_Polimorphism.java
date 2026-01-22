package OOPS.Polymorphism;

class Animal {

    void eat() {
        System.out.println("Animals will eat");
    }

    void sleep() {
        System.out.println("Animals will sleep");
    }
}

class Deer extends Animal {

    @Override
    void eat() {
        System.out.println("Deer eats grass");
    }
}

class Monkey extends Animal {

    @Override
    void eat() {
        System.out.println("Monkey eats fruits");
    }
}

class Tiger extends Animal {

    @Override
    void eat() {
        System.out.println("Tiger eats meat");
    }
}

public class Runtime_Polimorphism {

    public static void main(String[] args) {

        Deer d = new Deer();
        forest(d);

        Monkey m = new Monkey();
        forest(m);

        Tiger t = new Tiger();
        forest(t);
    }

    public static void forest(Animal a) {
        a.eat();
        a.sleep();
    }
}

