package com.mrparag95.assignment1.television;

import com.mrparag95.assignment1.ElectricDevice;

public abstract class Television implements ElectricDevice {
    private int channelId;

    abstract void volumeUp();
    abstract void volumeDown();

    void changeChannel(int channelId) {
        this.setChannel(channelId);
    }

    private void setChannel(int channelId) {
        this.channelId = channelId;
    }
}
