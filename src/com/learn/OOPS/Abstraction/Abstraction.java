package com.learn.OOPS.Abstraction;

abstract class Robot {
    abstract void work();
    abstract void charge();
}

class TeacherRobot extends Robot {
    @Override
    void work() {
        System.out.println("Teacher Robot will teach");
    }

    @Override
    void charge() {
        System.out.println("Teacher Robot is charging");
    }
}

class CleanerRobot extends Robot {
    @Override
    void work() {
        System.out.println("Cleaner Robot will clean");
    }

    @Override
    void charge() {
        System.out.println("Cleaner Robot is charging");
    }
}

class DoctorRobot extends Robot {
    @Override
    void work() {
        System.out.println("Doctor Robot will do surgery");
    }

    @Override
    void charge() {
        System.out.println("Doctor Robot is charging");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        CleanerRobot cleanerRobot = new CleanerRobot();
        TeacherRobot teacherRobot = new TeacherRobot();
        DoctorRobot doctorRobot = new DoctorRobot();
        display(cleanerRobot);
        display(teacherRobot);
        display(doctorRobot);
    }
    public static void display(Robot r) {
        r.work();
        r.charge();

    }
}
