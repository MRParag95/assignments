package com.mrparag95.assignment1.fan;

public class Havels extends Fan {
    private boolean isOn = false;
    private int currentSpeed = 0;

    public Havels(boolean isOn, int currentSpeed) {
        this.isOn = isOn;
        if (!isOn && currentSpeed != 0) {
            System.out.println("Speed can't be grater or less then 0 while Fan is turned off. Setting the Speed to 0.");
            this.currentSpeed = 0;
        } else {
            this.currentSpeed = currentSpeed;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    private void setOn(boolean on) {
        isOn = on;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    private void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void turnOn() {
        if (this.isOn) {
            System.out.println("Already Turned On.");
        } else {
            System.out.println("Turning On " + this.getClass().getName());
            this.setOn(true);
            this.setCurrentSpeed(1);
        }
    }

    @Override
    public void turnOff() {
        if (!this.isOn) {
            System.out.println("Already Turned Off.");
        } else {
            System.out.println("Turning Off " + this.getClass().getName());
            this.setOn(false);
            this.setCurrentSpeed(0);
        }
    }

    @Override
    void speedUp() {
        if (!this.isOn()) {
            System.out.println("Please turn your " + this.getClass().getName() + " first");
        } else {
            if (!(currentSpeed >= 100)) {
                this.setCurrentSpeed(this.getCurrentSpeed() + 1);
                System.out.println("Speeding Up " + this.getClass().getName());
            } else {
                System.out.println("Speed is already at it's maximum state.");
            }
        }
    }

    @Override
    void speedDown() {
        if (!this.isOn()) {
            System.out.println("Please turn your " + this.getClass().getName() + " first");
        } else {
            if (!(currentSpeed <= 0)) {
                this.setCurrentSpeed(this.getCurrentSpeed() + 1);
                System.out.println("Speeding Down " + this.getClass().getName());
            } else {
                System.out.println("Speed is already at it's lowest state.");
            }
        }
    }
}
