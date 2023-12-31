import java.util.concurrent.TimeUnit;

public class Exampel1 {
    /*
    Meter(택시 미터기) 인터터페이스는 start 와 stop 이라는 추상 메소드를 가지고 있다.
    stop 메소드는 달린 거리에 해당하는 값(distance)를 매개변수로 받아 요금을
    int 형을 반환하는 메소드입니다. Meter 인터페이스를 구현하는 택시 클래스를
    완성해 보세요. 요금은 distance x 2 로 계산하세요.
     */
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        taxi.start();
        taxi.stop(taxi.getDistance());
        System.out.println("내실 요금은: " + taxi.stop(taxi.getDistance()));
    }
}

interface Meter {
    void start();
    int stop(int distance);
}

class Taxi implements Meter{
    private int distance = 0;

    public int getDistance() {
        return distance;
    }

    @Override
    public void start() {
    }

    @Override
    public int stop(int distance) {
        return distance * 2;
    }
}
