package javasBible.interfaceExample.chap_8_exceptionHandling;

public class Exercise8_9 {
    public static void main(String[] args) throws Exception {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
    }
}
class UnsupportedFuctionException extends RuntimeException{
    final private int ERR_CODE;

    public UnsupportedFuctionException(String message, int ERR_CODE) { //생성자
        super(message);
        this.ERR_CODE = ERR_CODE;
    }

    public UnsupportedFuctionException(String message) { //생성자
        this(message, 100); //ERR_CODE를 100(기본값)으로 초기화한다.
    }

    public int getErrorCode() { //에러 코드를 얻을 수 있는 메서드도 추가
        return ERR_CODE;
    }

    @Override
    public String getMessage() { //Exception의 getMessage() 오버라이딩
        return "[" + getErrorCode() + "]" + super.getMessage();
    }
}
