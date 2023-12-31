package programmers;

public class Example3 {
    public static void main(String[] args){
        Taxi taxi = new Taxi();

        taxi.start();
        taxi.afterMidnight();
        taxi.stop(10);
    }
}
