package com.mrparag95;

import com.mrparag95.assignment1.ElectricDevice;
import com.mrparag95.assignment1.fan.Fan;
import com.mrparag95.assignment1.fan.GCC;

public class Main {
    public static void main(String[] args) {
        Fan gccFan = new GCC(true, 30);

        gccFan.turnOff();
        gccFan.turnOn();
        System.out.println(((GCC) gccFan).getCurrentSpeed());
    }
}