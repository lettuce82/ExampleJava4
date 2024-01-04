package javasBible.interfaceExample.chap_7_oop.innerClass;

class Unit {
    int x, y;

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void stop(){};
}

class Marine extends Unit {
    void stimePack(){};
}
class Tank extends Unit {
    void changeMode(){};
}
class Dropship extends Unit {
    void load(){};
    void unload(){};
}
public class Exercise7_17 {
}
