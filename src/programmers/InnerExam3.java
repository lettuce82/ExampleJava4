package programmers;

public class InnerExam3 {
    public void exec() {
        class Cal {
            int value = 0;
            public void plus() {
                value++;
            }
        }

        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }
    public static void main(String[] args) {
        InnerExam3 innerExam3 = new InnerExam3();
        innerExam3.exec();


    }
}
