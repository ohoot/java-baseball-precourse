package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ModelTest {
    private Model model;

    @BeforeEach
    void setUp() {
        model = new Model();
    }

    @Test
    void getAnswer() {
        System.out.println(model.getAnswer());
    }
}
