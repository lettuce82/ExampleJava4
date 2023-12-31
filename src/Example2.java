public class Example2 {
    public static void main(String[] args) {
        //객체 생성
        Person person = new Person(); //method1, ppp
        person.method1();
        person.ppp();
        Student student = new Student(); //method1(오버라이딩), ppp, sss
        student.method1();
        student.ppp();
        student.sss();
        Person student1 = new Student(); //method1(오버라이딩), ppp
        student1.method1();
        student1.ppp();
    }
}

class Person {
    String st1 = "난 부모 클래스";
    void method1() {
        System.out.println("에이에이에이");
    }
    void ppp() {
        System.out.println("ppp");
    }
}

class Student extends Person {
    String st2 = "난 자식 클래스";
    void method1() {
        super.method1();
        System.out.println("오버라이딩 - AAA");
    }
    void sss() {
        System.out.println("sss");
    }
}
