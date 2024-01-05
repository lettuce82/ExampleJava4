package java_ex_1000;

public class WordScrambleEx1{
    public static void main(String[] args) {
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

        String answer = getAnswer(strArr);
        String question = getScrambledWord(answer);

        System.out.println("Question:"+question);
        System.out.println("Answer:"+answer);
    } // main

    public static String getAnswer(String[] strArr) {
        //배열 strArr의 요소 중의 하나를 임의로 골라서 반환한다.
        String str = strArr[(int) (Math.random() * strArr.length)];

        return str;
    }

    public static String getScrambledWord(String str) {
        //주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다.
        String[] strChar = new String[str.length()];
        String word = "";

        //1. 반복문으로 str의 스펠링을 배열에 담는다.
        for (int i = 0; i < str.length(); i++) {
            strChar[i] = str.substring(i);
            System.out.println(strChar[i]);
        }

        //2. 배열을 섞는다.
        for (int i = 0; i < strChar.length; i++) {
            int randomNum = (int) (Math.random() * strChar.length);
            strChar[i] = strChar[randomNum];

            word += strChar[i];

            System.out.println(word);
        }



        return null;
    } // scramble(String str)

}
