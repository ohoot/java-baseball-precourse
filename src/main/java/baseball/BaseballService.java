package baseball;

import baseball.dto.MatchDTO;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.Set;

public class BaseballService {
    private static final int ANSWER_LENGTH = 3;
    private static final int MAX_COUNT = 3;
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 9;

    static int generateAnswer() {
        return convertAnswer(generateAnswerSet());
    }

    private static Set<Integer> generateAnswerSet() {
        Set<Integer> answerSet = new HashSet<>(ANSWER_LENGTH);

        while (answerSet.size() < ANSWER_LENGTH) {
            answerSet.add(Randoms.pickNumberInRange(START_RANGE, END_RANGE));
        }

        return answerSet;
    }

    private static int convertAnswer(Set<Integer> answerSet) {
        StringBuilder sb = new StringBuilder(ANSWER_LENGTH);

        for (int i : answerSet) {
            sb.append(i);
        }

        return Integer.parseInt(sb.toString());
    }

    static MatchDTO match(int answer, int input) {
        if (answer == input) {
            return new MatchDTO(0, MAX_COUNT);
        }

        int ballCnt = 0;
        int strikeCnt = 0;

        String answerStr = answer + "";
        String inputStr  = input + "";

        for (int i = 0; i < answerStr.length(); i++) {
            for (int j = 0; j < inputStr.length(); j++) {
              if (answerStr.charAt(i) == inputStr.charAt(i)) {
                  strikeCnt++;
                  break;
              }

              if (i == j) {
                  continue;
              }

              if (answerStr.charAt(i) == inputStr.charAt(j)) {
                  ballCnt++;
                  break;
              }
            }
        }

        boolean isNothing = ballCnt == 0 && strikeCnt == 0;

        return new MatchDTO(isNothing, ballCnt, strikeCnt);
    }
}
