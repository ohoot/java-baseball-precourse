package baseball.dto;

import baseball.validator.MatchValidator;

public class MatchDTO {
    private boolean isNothing;
    private int ballCnt;
    private int strikeCnt;

    public MatchDTO(int ballCnt, int strikeCnt) {
        MatchValidator.validateCount(ballCnt, strikeCnt);

        this.ballCnt = ballCnt;
        this.strikeCnt = strikeCnt;
    }

    public MatchDTO(boolean isNothing, int ballCnt, int strikeCnt) {
        MatchValidator.validateCount(ballCnt, strikeCnt);

        this.isNothing = isNothing;
        this.ballCnt = ballCnt;
        this.strikeCnt = strikeCnt;
    }

    public boolean isNothing() {
        return isNothing;
    }

    public int getStrikeCnt() {
        return strikeCnt;
    }

    public int getBallCnt() {
        return ballCnt;
    }
}
