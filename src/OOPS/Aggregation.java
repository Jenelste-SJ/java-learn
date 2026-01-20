package OOPS;

class Charger {
    String color;
    float voltage;
    char type;

    public Charger(String color, float voltage, char type) {
        this.color = color;
        this.voltage = voltage;
        this.type = type;
    }
}

class Mobile {
    String brand;
    String color;
    int price;

    public Mobile(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    void hasCharger(Charger c) {
        System.out.println(c.color);
        System.out.println(c.voltage);
        System.out.println(c.type);
    }
}

public class Aggregation {
    public static void main(String[] args) {

        Charger c = new Charger("White", 12.5f, 'C');
        Mobile m = new Mobile("SAMSUNG", "Black", 55000);

        System.out.println(m.brand);
        System.out.println(m.color);
        System.out.println(m.price);

        m.hasCharger(c);

        c = null;

        System.out.println();
        System.out.println(m.color);
        System.out.println(m.price);
    }
}

