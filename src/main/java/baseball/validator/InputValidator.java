package baseball.validator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputValidator {
    private static final int INPUT_LENGTH = 3;
    private static final Character CHAR_ZERO = '0';
    private static final String SIG_RESTART = "1";
    private static final String SIG_TERM = "2";

    public static void validateInput(String input) {
        validateLength(input);
        validateDuplication(input);

        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);

            validateDigit(c);
            validateZero(c);
        }
    }

    private static void validateLength(String input) {
        if (input.length() != INPUT_LENGTH) {
            throw new IllegalArgumentException("Invalid length");
        }
    }

    private static void validateDigit(Character c) {
        if (!Character.isDigit(c)) {
            throw new IllegalArgumentException("Not a number");
        }
    }

    private static void validateZero(Character c) {
        if (c.equals(CHAR_ZERO)) {
            throw new IllegalArgumentException("Zero is not allowed");
        }
    }

    private static void validateDuplication(String input) {
        Set<Character> set = new HashSet<>(convertStringToList(input));

        if (set.size() != INPUT_LENGTH) {
            throw new IllegalArgumentException("A Number is duplicated");
        }
    }

    private static List<Character> convertStringToList(String input) {
        List<Character> chars = new ArrayList<>();

        for (Character ch : input.toCharArray()) {
            chars.add(ch);
        }

        return chars;
    }

    public static void validateExit(String input) {
        if (!input.equals(SIG_RESTART) && !input.equals(SIG_TERM)) {
            throw new IllegalArgumentException();
        }
    }
}
