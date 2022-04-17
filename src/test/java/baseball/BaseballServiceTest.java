package baseball;

import baseball.dto.MatchDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BaseballServiceTest {
    @Test
    void generateAnswer() {
        System.out.println(BaseballService.generateAnswer());
    }

    @ParameterizedTest
    @CsvSource(value = {"123:321", "246:246", "967:963", "967:367", "295: 396", "456:987", "624:462", "624:463"}, delimiter = ':')
    void match(int i, int j) {
        System.out.println(i + ", " + j);
        MatchDTO dto = BaseballService.match(i, j);
        System.out.println("b: " + dto.getBallCnt() + ", s: " + dto.getStrikeCnt() + ", n: " + dto.isNothing());
    }
}
