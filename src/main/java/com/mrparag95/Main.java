package com.mrparag95;

import com.mrparag95.assignment1.ElectricDevice;
import com.mrparag95.assignment1.fan.GCC;
import com.mrparag95.assignment1.television.Sony;
import com.mrparag95.assignment1.television.Television;

public class Main {
    public static void main(String[] args) throws Exception {
        ElectricDevice fan = new GCC(true, 30);
        ElectricDevice tv = new Sony(true, 30, 5);

        fan.turnOff();
        fan.turnOn();
        ((GCC) fan).speedUp();
        System.out.println(((GCC) fan).getCurrentSpeed());

        tv.turnOff();
        tv.turnOn();
        ((Sony) tv).volumeUp();
        System.out.println(((Television) tv).getChannel());
    }
}