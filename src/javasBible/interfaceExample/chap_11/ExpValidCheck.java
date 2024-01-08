package javasBible.interfaceExample.chap_11;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ExpValidCheck \"EXPRESSION\"");
            System.out.println("Example: java ExpValidCheck \"((2 + 3) * 1) + 3\"");
            System.exit(0);
        }

        Stack st = new Stack();
        String expresstion = args[0];

        System.out.println("expresstion:" + expresstion);

        try {
            for (int i = 0; i < expresstion.length(); i++) {
                char ch = expresstion.charAt(i);

                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop(); // 마지막 것을 없애면서 출력
                }
            }

            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
