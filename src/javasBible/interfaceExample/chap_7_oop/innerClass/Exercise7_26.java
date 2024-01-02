package javasBible.interfaceExample.chap_7_oop.innerClass;

class Outer1 {
    static class Inner {
        int iv = 200;
    }
}
public class Exercise7_26 {
    public static void main(String[] args) {
        //외부 클래스 객체 생성
        Outer1 outer1 = new Outer1();
        
        //외부 클래스 참조값으로 Inner 클래스 접근&객체 생성
        Outer1.Inner inner = new Outer1.Inner();

        //내부클래스 참조값을 통해 내부클래스의 인스턴스 변수값 출력
        System.out.println(inner.iv);
    }
}
