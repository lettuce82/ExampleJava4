package javasBible.interfaceExample.chap_7_oop.innerClass;

class MyTv3 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

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
        this.prevChannel = this.channel;
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

    void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}
public class Exercise7_11 {
    public static void main(String[] args) {
        MyTv3 myTv3 = new MyTv3();

        myTv3.setChannel(10);
        System.out.println("CH: " + myTv3.getChannel());
        myTv3.setVolume(20);
        System.out.println("VOL: " + myTv3.getVolume());
        System.out.println("-----------------------------");

        myTv3.setChannel(20);
        System.out.println("CH: " + myTv3.getChannel());
        myTv3.gotoPrevChannel();
        System.out.println("CH: " + myTv3.getChannel());
        myTv3.gotoPrevChannel();
        System.out.println("CH: " + myTv3.getChannel());
    }
}
