package com.mrparag95.assignment1.television;

public class Sony extends Television {
    @Override
    public void turnOn() {
        System.out.println("Turning On" + this.getClass().getName());
    }

    @Override
    public void turnOff() {
        System.out.println("Turning Off" + this.getClass().getName());
    }

    @Override
    void volumeUp() {
        System.out.println("Increasing Volume" + this.getClass().getName());
    }

    @Override
    void volumeDown() {
        System.out.println("Decreasing Volume" + this.getClass().getName());
    }
}
