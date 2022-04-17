package baseball;

import baseball.dto.MatchDTO;
import baseball.validator.InputValidator;
import camp.nextstep.edu.missionutils.Console;

import static baseball.validator.InputValidator.validateInput;

public class BaseballController {
    private static final String SIG_RESTART = "1";
    private static final String SIG_TERM = "2";

    private BaseballModel model = new BaseballModel(BaseballService.generateAnswer());
    private boolean isRunning = true;

    void playGame() {
        while (isRunning) {
            BaseballView.printInputMessage();
            String input = Console.readLine();

            validateInput(input);

            MatchDTO dto = BaseballService.match(model.getAnswer(), Integer.parseInt(input));

            actionWithResult(dto);
        }

    }

    private void actionWithResult(MatchDTO dto) {
        if (dto.getStrikeCnt() == 3) {
            BaseballView.printStrike(dto.getStrikeCnt());

            actionForWin();
            return;
        }

        if (dto.isNothing()) {
            BaseballView.printNothing();
            return;
        }

        if (dto.getStrikeCnt() == 0) {
            BaseballView.printBall(dto.getBallCnt());
            return;
        }

        if (dto.getBallCnt() == 0) {
            BaseballView.printStrike(dto.getStrikeCnt());
            return;
        }

        BaseballView.printBallAndStrike(dto.getBallCnt(), dto.getStrikeCnt());
    }

    private void actionForWin() {
        BaseballView.printEndMessage();

        String exitInput = Console.readLine();
        InputValidator.validateExit(exitInput);

        if (exitInput.equals(SIG_RESTART)) {
            model.setAnswer(BaseballService.generateAnswer());
            return;
        }

        if (exitInput.equals(SIG_TERM)) {
            isRunning = false;
        }
    }
}
