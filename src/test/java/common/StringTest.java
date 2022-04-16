package common;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

public class StringTest {

    @Test
    @DisplayName("1,2를 ,로 자른다.")
    void split() {
        String testStr = "1,2";
        assertThat(testStr.split(",")).contains("1", "2");
    }

    @Test
    void split2() {
        String testStr = "1";
        assertThat(testStr.split(",")).containsExactly("1");
    }

    @Test
    void substring() {
        String testStr = "(1,2)";
        assertThat(testStr.substring(1, 4)).isEqualTo("1,2");
    }

    @Test
    @DisplayName("문자열 abc 중 특정 위치의 문자를 가져온다.")
    void charAt() {
        String testStr = "abc";

        assertThat(testStr.charAt(2)).isEqualTo('c');
    }

    @Test
    @DisplayName("assertThatThrownBy()를 활용하여 예외처리를 다룬다.")
    void exception() {
        String testStr = "abc";

        assertThatThrownBy(() -> {
            testStr.charAt(5);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
          .hasMessageContaining("range: 5");
    }

    @Test
    @DisplayName("assertThatThrownBy()를 활용하여 예외처리를 다룬다.")
    void exception2() {
        String testStr = "abc";

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    testStr.charAt(5);
                }).withMessageContaining("index out of range: 5");
    }

    @Test
    void charAt2() {
        String testStr = "1123";
        List<Character> chars = new ArrayList<>();

        for (char ch : testStr.toCharArray()) {
            chars.add(ch);
        }

        Set<Character> set = new HashSet<>(chars);

        assertThat(set.size()).isEqualTo(3);
    }
}
