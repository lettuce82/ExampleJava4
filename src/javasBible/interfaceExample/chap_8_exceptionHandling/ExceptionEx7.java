package javasBible.interfaceExample.chap_8_exceptionHandling;

public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0); //고의로 ArithmeticException을 발생
            System.out.println(4); //실행되지 않는다.
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");
                System.out.println("ArithmeticException");
            }
            System.out.println(5);
        } catch (Exception e) { //위에서 예외처리가 되었기 때문에 실행 X , ArithmeticException 이외의 예외 처리
            System.out.println("Exception");
        } //try-catch의 끝
        System.out.println(6);
    } //main메서드의 끝
}
