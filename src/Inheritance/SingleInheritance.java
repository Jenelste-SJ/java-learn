package Inheritance;


class Person {
    String name;

    void introduce() {
        System.out.println("Hello, my name is " + name + ".");
    }
}

class Professor extends Person1 {
    String department;

    void conductLecture() {
        System.out.println(name + " is conducting a lecture.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Professor1 professor1 = new Professor1();
        professor1.name = "Harish Pathak";
        professor1.department = "Computer Science";

        System.out.println("Professor Name: " + professor1.name);
        System.out.println("Department: " + professor1.department);
        professor1.introduce();
        professor1.conductLecture();
    }
}

