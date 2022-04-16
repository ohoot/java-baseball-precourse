package baseball;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class ValidatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"1233", "1236", "21a", "asd", "108", "445", "1327"})
    void validateWrongInput(String input) {
        assertThatThrownBy(() -> {
            Validator.validateInput(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"456", "136", "812"})
    void validateCorrectInput(String input) {
        Validator.validateInput(input);
    }
}
