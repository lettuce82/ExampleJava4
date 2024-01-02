package javasBible.interfaceExample.chap_7_oop.innerClass;

class Outer {
    class Inner {
        int iv = 100;
    }
}

public class Exercise7_25 {
    public static void main(String[] args) {
        //외부 클래스 객체 생성
        Outer outer = new Outer();

        //외부 클래스 참조값을 통해 내부클래스 접근&객체 생성
        Outer.Inner inner = outer.new Inner();

        //내부클래스 참조값을 통해 내부클래스의 인스턴스 변수값 출력
        System.out.println(inner.iv);
    }
}
