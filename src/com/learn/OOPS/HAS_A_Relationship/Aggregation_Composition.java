package com.learn.OOPS.HAS_A_Relationship;

class OS {
    String name;

    public OS(String name) {
        this.name = name;
    }

    void osDetails() {
        System.out.println("OS name: " + name);
    }
}

class Charger {
    char type;

    public Charger(char type) {
        this.type = type;
    }

    void chargerDetails() {
        System.out.println("Charger type: " + type);
    }
}

class Mobile {
    String brand;
    OS os;   // Composition
    Charger c; // Aggregation

    public Mobile(String brand, String osName) {
        this.brand = brand;
        this.os = new OS(osName);
    }

    void chargeMobile() {
        System.out.println("Mobile is charging");
        c.chargerDetails();
    }

    void mobileDetails() {
        System.out.println("Mobile brand: " + brand);
        os.osDetails();
    }
}

public class Aggregation_Composition {
    public static void main(String[] args) {

        Charger ch = new Charger('C');

        Mobile m = new Mobile("SAMSUNG", "Android");

        m.mobileDetails();

        m.c = ch;
        m.chargeMobile();

        ch = null; // aggregation example
    }
}

