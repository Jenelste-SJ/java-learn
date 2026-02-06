package com.learn.OOPS.Polymorphism;


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

class CleaningRobot extends Robot {
    @Override
    public void tasks() {
        System.out.println("Cleaning robots clean floors and surfaces efficiently!");
    }
}

class IndustrialRobot extends Robot {
    @Override
    public void tasks() {
        System.out.println("Industrial robots complete industrial tasks efficiently!");
    }
}

public class Upcasting_1 {
    public static void main(String[] args) {
        CleaningRobot cleanRobo = new CleaningRobot();
        operateRobo(cleanRobo);

        System.out.println();

        IndustrialRobot indRobo = new IndustrialRobot();
        operateRobo(indRobo);
    }

    public static void operateRobo(Robot robo) {
        robo.learn();
        robo.charge();
        robo.tasks();
    }
}
