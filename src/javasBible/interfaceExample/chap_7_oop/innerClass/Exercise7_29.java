package javasBible.interfaceExample.chap_7_oop.innerClass;

/*
        Q) 지역 클래스에서 외부 클래스의 인스턴스 멤버와 static 멤버에 모두 접근할 수
           있지만 지역변수는 final이 붙은 상수만 접근할 수 있는 이유 무엇인가?

        A) 지역변수가 정의된 지역 메서드가 수행을 마치면 메서드에 포함된 지역변수도 소멸하게 되는데
           지역 메서드 내에 정의된 지역 클래스의 인스턴스 경우 지역 메서드의 호출이 종료되도 소멸되지 않는다.
           따라서 지역 메서드와 내부 지역변수의 생명주기와 지역 클래스의 인스턴스의 생명주기가 달라
           소멸된 지역변수를 지역 클래스의 인스턴스가 참조하는 경우 등 동작의 안전성을 보장하지 못하는 경우가 발생한다.
           따라서 이러한 경우를 방지하기 위해 final 키워드를 사용한 변수만 참조할 수 있도록 한 것이다.
        ---------------------------------------------------------------------------------------------
        지역변수
        - 선언 위치 : 클래스 영역 이외의 영역( 메소드, 생성자, 초기화 블럭 내부)
        - 특정한 구역(메소드, 생성자, 초기화 블록(( ), { })에 생성되어 그 지역에서만 사용할 수 있는 변수를 의미한다.

        cf. JDK 1.8부터는 final 키워드 생략이 가능하다 -> 컴파일러가 자동으로 final 을 붙여줌.
 */

class OuterClass {
    int iv = 100;
    static int cv = 200;

    void method1() {
        int lv = 100;

        class LocalClass {
            int lclv = 100;
            final int fv = 200;

            //지역 클래스는 외부 클래스의 인스턴스멤버와 static 멤버를 모두 사용할 수 있다.
            int a = iv;
            int b = cv;
            //지역 클래스가 포함된 메서드에 정의된 지역변수를 사용할 수 있다.
            int c = lv;
            //final 이 붙은 지역변수만 참조 가능.
            int d = fv;
            //JDK 1.8부터는 final 키워드 생략이 가능하다 -> 컴파일러가 자동으로 final 을 붙여줌.
            int e = lclv;
        } //지역 클래스 끝
    } //메서드 끝
} //외부 클래스

public class Exercise7_29 {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
    }
}
