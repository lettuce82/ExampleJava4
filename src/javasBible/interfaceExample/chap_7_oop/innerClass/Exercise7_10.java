package javasBible.interfaceExample.chap_7_oop.innerClass;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel < MIN_VOLUME || channel > MAX_VOLUME) {
            return;
        }
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < MIN_CHANNEL || volume > MAX_CHANNEL) {
            return;
        }
        this.volume = volume;
    }
}
public class Exercise7_10 {
    public static void main(String[] args) {
        MyTv2 myTv2 = new MyTv2();

        myTv2.setChannel(200);
        System.out.println("CH: " + myTv2.getChannel());
        myTv2.setVolume(100);
        System.out.println("VOL: " + myTv2.getVolume());
    }
}
