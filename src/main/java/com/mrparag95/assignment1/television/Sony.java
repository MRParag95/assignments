package com.mrparag95.assignment1.television;

public class Sony extends Television {
    private boolean isOn = false;
    private int volumeLevel = 0;

    public Sony(boolean isOn, int channelId, int volumeLevel) throws Exception {
        super(channelId);
        this.setOn(isOn);
        if (!isOn && (channelId != 0 || volumeLevel != 0)) {
            throw new Exception("Channel or volume can't be set while TV is turned off.");
        } else {
            this.setVolumeLevel(volumeLevel);
        }
    }

    public boolean isOn() {
        return isOn;
    }

    private void setOn(boolean on) {
        isOn = on;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    private void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void turnOn() {
        if (this.isOn) {
            System.out.println("Already Turned On.");
        } else {
            System.out.println("Turning On " + this.getClass().getName());
            this.setOn(true);
            this.setVolumeLevel(1);
            super.setChannel(1);
        }
    }

    @Override
    public void turnOff() {
        if (!this.isOn) {
            System.out.println("Already Turned Off.");
        } else {
            System.out.println("Turning Off " + this.getClass().getName());
            this.setOn(false);
            this.setVolumeLevel(0);
            super.setChannel(0);
        }
    }

    @Override
    public void volumeUp() {
        if (!this.isOn()) {
            System.out.println("Please turn your " + this.getClass().getName() + " first");
        } else {
            if (!(volumeLevel >= 100)) {
                this.setVolumeLevel(this.getVolumeLevel() + 1);
                System.out.println("Increasing " + this.getClass().getName());
            } else {
                System.out.println("Volume is already at it's maximum state.");
            }
        }
    }

    @Override
    public void volumeDown() {
        if (!this.isOn()) {
            System.out.println("Please turn your " + this.getClass().getName() + " first");
        } else {
            if (!(volumeLevel <= 0)) {
                this.setVolumeLevel(this.getVolumeLevel() + 1);
                System.out.println("Decreasing " + this.getClass().getName());
            } else {
                System.out.println("Volume is already at it's lowest state.");
            }
        }
    }
}
