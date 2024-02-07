package com.mrparag95.assignment1.television;

import com.mrparag95.assignment1.ElectricDevice;

public abstract class Television implements ElectricDevice {
    private int channelId;

    public Television(int channelId) {
        if (channelId <= 0) {
            System.out.println("Invalid channel id. Setting it to 1.");
            this.setChannel(1);
        }
        this.setChannel(channelId);
    }

    public abstract void volumeUp();
    abstract void volumeDown();

    void changeChannel(int channelId) {
        this.setChannel(channelId);
    }

    protected void setChannel(int channelId) {
        this.channelId = channelId;
    }
    public int getChannel() {
        return this.channelId;
    }
}
