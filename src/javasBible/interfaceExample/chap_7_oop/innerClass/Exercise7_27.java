package javasBible.interfaceExample.chap_7_oop.innerClass;

class Outer3 {
    int value = 10;

    class Inner {
        int value = 20;
        void method1() {
            int value = 30;

            //가장 가까운 블럭(method1) 내의 value 값 출력
            System.out.println(value);

            //this - 인스턴스의 참조값
            System.out.println(this.value);

            //외부클래스명.this.변수명 으로 접근 가능
            System.out.println(Outer3.this.value);
        }
    } //Inner 클래스의 끝
} //Outer 클래스의 끝

public class Exercise7_27 {
    public static void main(String[] args) {
        //외부 클래스 객체 생성
        Outer3 outer3 = new Outer3();

        //외부 클래스 참조값을 통해 inner class 접근 및 객체 생성
        Outer3.Inner inner = outer3.new Inner();

        //inner class 참조값을 통해 method1() 호출
        inner.method1();
    }
}
