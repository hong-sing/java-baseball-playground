package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual = "1,2".split(",");
        assertThat(actual).containsExactly("1", "2");

        String[] actual1 = "1".split(",");
        assertThat(actual1).contains("1");
    }

    @Test
    void substring() {
        String input = "(1,2)";
        String actual = input.substring(1,4);
        assertThat(actual).isEqualTo("1,2");
    }

    @DisplayName("특정 위치 문자 가져오기")
    @Test
    void charAt() {
        String input = "abc";

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class).isThrownBy(()->{
            throw new StringIndexOutOfBoundsException(input.charAt(3));
        }).withMessageMatching("String index out of range: 3");
    }
}
