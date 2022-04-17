package baseball.validator;

public class MatchValidator {
    private static final int MIN_BALL_STRIKE = 0;
    private static final int MAX_BALL_STRIKE = 3;

    public static void validateCount(int ballCnt, int strikeCnt) {
        if (ballCnt < MIN_BALL_STRIKE || ballCnt > MAX_BALL_STRIKE) {
            throw new RuntimeException();
        }

        if (strikeCnt < MIN_BALL_STRIKE || strikeCnt > MAX_BALL_STRIKE) {
            throw new RuntimeException();
        }
    }

    public static void validateCount(int cnt) {
        if (cnt < MIN_BALL_STRIKE || cnt > MAX_BALL_STRIKE) {
            throw new RuntimeException();
        }
    }
}
