package javasBible.interfaceExample.chap_7_oop.innerClass;

class Parent {
    int x = 100; //200
    Parent() {
        this(200);
    }

    Parent(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 3000;
    Child() {
        this(1000);
    }

    Child(int x) {
        this.x = x;
    }
}
public class Exercise7_7 {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println("x=" + child.getX());
    }
    /*
        실행순서는?

        Child() -> Child(int x) -> Parent() -> Parent(int x) -> Object()
        [해설]
        컴파일러는 생성자의 첫 줄에 다른 생성자를 호출하지 않으면 조상의 기본 생성자를 호출하는 코드를 넣는다. -> super()

        실행 결과는?

        200
     */
}
