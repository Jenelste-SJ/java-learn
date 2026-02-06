package com.learn.OOPS.Polymorphism;


class Device {
    public void powerOn() {
        System.out.println("Device is powered on.");
    }
}

class Smartphone extends Device {
    @Override
    public void powerOn() {
        System.out.println("Smartphone is powered on with a touch screen interface.");
    }
}

public class UpCasting {
    public static void main(String[] args) {
        Device myDevice = new Smartphone(); // Upcasting
        myDevice.powerOn();
    }
}

