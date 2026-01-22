package OOPS.Polymorphism;


class Robot {
    public void learn() {
        System.out.println("Robots can learn almost anything!");
    }

    public void charge() {
        System.out.println("Robots need charging to operate.");
    }

    public void tasks() {
        System.out.println("Robots complete tasks efficiently!");
    }
}

public class Upcasting_1 {
    public static void main(String[] args) {
        Robot robo = new Robot();
        operateRobo(robo);

        Robot robo2 = new Robot();
        operateRobo(robo2);
    }

    public static void operateRobo(Robot robo) {
        robo.learn();
        robo.charge();
        robo.tasks();
    }
}

