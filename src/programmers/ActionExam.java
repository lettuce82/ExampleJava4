package programmers;

public class ActionExam {
    public static void main(String[] args) {
        Action action = new MyAction();
        action.exec();

        Action action1 = new Action() {
            @Override
            public void exec() {
                System.out.println("익명 클래스로 구현");
            }
        };
        action1.exec();
    }
}
