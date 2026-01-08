package OOPS;
 class Employeee {
    private int id;
    private String name;
    private double salary;


    public Employeee(int id, String name, double salary) {
         System.out.println("Employee constructor");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
     {
         System.out.println("Employee class constructor");
     }
    public void display() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Employeee employeee = new Employeee(1, "John", 5000);
        Employeee employeee1 = new Employeee(1, "Han", 5000);
        Employeee employeee2 = new Employeee(1, "Rock", 5000);
        employeee.display();
        System.out.println("--------------------");
        employeee1.display();
        System.out.println("--------------------");
        employeee2.display();
    }
}
