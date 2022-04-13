package baseball;

public class View {
    private static final String INPUT_MSG = "숫자를 입력해주세요:";
    private static final String END_MSG = "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String NOTHING = "낫싱";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";

    public static void printInputMessage() {
        System.out.print(INPUT_MSG + " ");
    }

    public static void printEndMessage() {
        System.out.println(END_MSG);
    }

    public static void printNothing() {
        System.out.println(NOTHING);
    }

    public static void printBall(int b) {
        System.out.println(b + BALL);
    }

    public static void printStrike(int s) {
        System.out.println(s + STRIKE);
    }

    public static void printBallAndStrike(int b, int s) {
        System.out.println(b + BALL + " " + s + STRIKE);
    }
}
