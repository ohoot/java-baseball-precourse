package baseball;

import camp.nextstep.edu.missionutils.Console;

import static baseball.Validator.validateInput;

public class Controller {
    private int userNumber;

    public void playGame() {
        String input = Console.readLine();

        validateInput(input);

    }
}
