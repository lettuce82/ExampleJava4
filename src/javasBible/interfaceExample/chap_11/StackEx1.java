package javasBible.interfaceExample.chap_11;

import java.util.Stack;

public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1. 네이트");
        goURL("2. 야후");
        goURL("3. 네이버");
        goURL("4. 다음");

        printStatus();

        goBack();
        System.out.println("= '뒤로' 버튼을 누른 후 =");
        printStatus();

        goBack();
        System.out.println("= '뒤로' 버튼을 누른 후 =");
        printStatus();


        goForward();
        System.out.println("= '앞으로' 버튼을 누른 후 =");
        printStatus();

        goURL("codechobo.com");
        System.out.println("= 새로운 주소로 이동 후 =");
        printStatus();
    }



    public static void printStatus() {
        System.out.println("back: " + back);
        System.out.println("forward: " + forward);
        System.out.println("현재화면은 '" + back.peek() + "' 입니다."); //back에 있는 마지막 값 출력
        System.out.println();
    }
    public static void goURL(String url) {
        back.push(url);
        if (!forward.empty()) { //이전 페이지가 있다면 비우기
            forward.clear();
        }
    }
    private static void goForward() {
        if (!forward.empty()) { //이전 페이지가 있다면 이전페이지
            back.push(forward.pop()); //forward 마지막 값을 back으로 옮기기 (forward 에서는 삭제, back 에서는 추가)
        }
    }

    public static void goBack() {
        if (!back.empty()) {
            forward.push(back.pop()); //back에 있는 마지막 값을 forward 로 옮김(back에서는 삭제, forward에서는 추가)
        }
    }
}
