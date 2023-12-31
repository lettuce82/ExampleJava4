public class Java100_oop_Polymorphism5 {
    public static void main(String[] args) {
        Car ambulance = new ambulance();
        Car farmCar = new farmCar();
        Car sportCar = new sportCar();

        ambulance.move();
        farmCar.move();
        sportCar.move();

        Car[] cars = {new ambulance(), new farmCar(), new sportCar()};
        for (Car car : cars) {
            car.sound();
        }
    }
}

abstract class Car {
    abstract void move();

    abstract void sound();
}

class ambulance extends Car {

    @Override
    void move() {
        System.out.println("앰뷸런스 지나가요~ 삐보삐뽀~");
    }

    @Override
    void sound() {
        System.out.println("삐보삐보~");
    }
}

class farmCar extends Car {

    @Override
    void move() {
        System.out.println("경운기 지나가요~ 덜컹덜컹");
    }

    @Override
    void sound() {
        System.out.println("덜컹덜컹~");
    }
}

class sportCar extends Car {

    @Override
    void move() {
        System.out.println("스포츠카 지나가요~ 씽~");
    }

    @Override
    void sound() {
        System.out.println("씽~");
    }
}
