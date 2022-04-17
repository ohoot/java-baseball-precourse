package baseball.validator;

import org.junit.jupiter.api.Test;

class MatchValidatorTest {
    @Test
    void validateCnt1() {
        MatchValidator.validateCount(3, 3);
    }

    @Test
    void validateCnt2() {
        MatchValidator.validateCount(2);
    }
}