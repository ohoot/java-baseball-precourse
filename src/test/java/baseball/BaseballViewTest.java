package baseball;

import org.junit.jupiter.api.Test;

public class BaseballViewTest {
    @Test
    public void inputTest() {
        BaseballView.printInputMessage();
    }

    @Test
    public void endTest() {
        BaseballView.printEndMessage();
    }

    @Test
    public void nothingTest() {
        BaseballView.printNothing();
    }

    @Test
    public void ballTest() {
        BaseballView.printBall(3);
    }

    @Test
    public void strikeTest() {
        BaseballView.printStrike(2);
    }

    @Test
    public void ballAndStrikeTest() {
        BaseballView.printBallAndStrike(2, 2);
    }
}
