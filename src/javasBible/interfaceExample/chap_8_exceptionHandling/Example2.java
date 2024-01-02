package javasBible.interfaceExample.chap_8_exceptionHandling;
/*
    Q) 다음은 실행도중 예외가 발생하여 화면에 출력된 내용이다 이에 대한 설명 중 옳지 않은 것은?

    java.lang.ArithmeticException : / by zero
    at ExceptionEx18.method2(ExceptionEx18.java:12)
    at ExceptionEx18.method1(ExceptionEx18.java:8)
    at ExceptionEx18.main(ExceptionEx18.java:4)

    a. 위의 내용으로 예외가 발생했을 당시 호출스택에 존재했던 메서드를 알 수 있다
    b. 예외가 발생한 위치는 method2 메서드이며 ExceptionEx18.java 파일의 8번째 줄이다
    c. 발생한 예외는 ArithmeticException이며, 0 으로 나누어서 예외가 발생했다
    d. method2메서드가 method1메서드를 호출하였고 그 위치는  ExceptionEx18.java 파일의 8번째 줄이다.

    A) d
    예외가 발생한 곳은 method2이고 12번째 줄이다.
    method1의 경우 예외가 발생한 곳이 method2를 호출한 부분이므로 8번째 줄이고,
    main의 경우 그러한 method1를 호출한 부분에서 예외가 발생했다.
    따라서 main -> method1 -> method2 순서로 호출되었다.

 */
public class Example2 {
}
