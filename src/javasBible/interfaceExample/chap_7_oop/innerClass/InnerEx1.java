package javasBible.interfaceExample.chap_7_oop.innerClass;

class InnerEx1 {
    class instanceInner {
        int iv = 100;
//        static int cv = 100; //에러! static 변수를 선언할수 없다.
        final static int Const = 100; //final static 은 상수이므로 허용
    }
}
