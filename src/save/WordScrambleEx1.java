package save;

public class WordScrambleEx1 {
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
        System.out.println(str);
        return str;
    }

    public static String getScrambledWord(String str) {
        //주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다.
        char[] spelling = str.toCharArray();

        System.out.println(spelling.length);
        for (int i = 0; i < str.length(); i++) {
            int num = (int)(Math.random() * str.length());
            
            char tmp = spelling[0];
            spelling[0] = spelling[num];
            spelling[num] = tmp;
        }
        return new String(spelling);
    } // scramble(String str)

}
