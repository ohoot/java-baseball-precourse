package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.Set;

public class Model {
    private static final int ANSWER_LENGTH = 3;
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 9;

    private final int answer = getAnswer(generateAnswer());

    private Set<Integer> generateAnswer() {
        Set<Integer> answerSet = new HashSet<>(ANSWER_LENGTH);

        while (answerSet.size() < ANSWER_LENGTH) {
            answerSet.add(Randoms.pickNumberInRange(START_RANGE, END_RANGE));
        }

        return answerSet;
    }

    private int getAnswer(Set<Integer> answerSet) {
        StringBuilder sb = new StringBuilder(ANSWER_LENGTH);

        for (int i : answerSet) {
            sb.append(i);
        }

        return Integer.parseInt(sb.toString());
    }

    int getAnswer() {
        return answer;
    }
}
