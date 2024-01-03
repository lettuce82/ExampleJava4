package javasBible.interfaceExample.chap_8_exceptionHandling;

public class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10); //7번째 라인
            } catch (ArithmeticException e) {
                result = 0;
            }
            System.out.println(result);
        }
    } //main의 끝
}
