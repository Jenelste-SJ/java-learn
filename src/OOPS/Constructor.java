package OOPS;
 class Employeee {
    private int id;
    private String name;
    private double salary;
    public Employeee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Employeee employeee = new Employeee(1, "John", 5000);
        Employeee employeee1 = new Employeee(1, "Han", 5000);
        Employeee employeee2 = new Employeee(1, "Rock", 5000);
        System.out.println(employeee.getName());
        System.out.println(employeee.getSalary());
        System.out.println("--------------------");

        System.out.println(employeee1.getName());
        System.out.println(employeee1.getSalary());
        System.out.println("--------------------");

        System.out.println(employeee2.getName());
        System.out.println(employeee2.getSalary());
    }
}
