package baseball;

import org.junit.jupiter.api.Test;

public class ViewTest {
    @Test
    public void inputTest() {
        View.printInputMessage();
    }

    @Test
    public void endTest() {
        View.printEndMessage();
    }

    @Test
    public void nothingTest() {
        View.printNothing();
    }

    @Test
    public void ballTest() {
        View.printBall(3);
    }

    @Test
    public void strikeTest() {
        View.printStrike(2);
    }

    @Test
    public void ballAndStrikeTest() {
        View.printBallAndStrike(2, 2);
    }
}
