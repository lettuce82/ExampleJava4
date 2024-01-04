package javasBible.interfaceExample.chap_7_oop.innerClass;

abstract class Shape {
    Point p;
    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calaArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }


}

class Circle extends Shape{
    double r;

    public Circle(double r) {
        this(new Point(0, 0), r);
    }

    public Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    @Override
    double calaArea() {
        return Math.pow(r, 2) * Math.PI;
    }
}

class Rectangle extends Shape{
    double width =10.0;
    double height=10.0;
    boolean isSquare;

    public Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    }

    public Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    @Override
    double calaArea() {
        return width*height;
    }

    boolean isSquare() {
        return width * height != 0 && width == height;
    }
}

class Point {
    int x;
    int y;
    Point() {
        this(0,0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}
public class Exercise7_22 {
    static double sumArea(Shape[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].calaArea();
        }
        return sum;
    }
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합: " + sumArea(arr));
    }
}
