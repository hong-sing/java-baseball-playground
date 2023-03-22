package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    @Test
    void size() {
        int size = numbers.size();
        assertThat(size).isEqualTo(size);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains(int i) {
        assertThat(numbers.contains(i)).isTrue();
    }

    @DisplayName("true,false값 다르게")
    @ParameterizedTest
//    @CsvSource(value = {"1,true", "2,true", "3,true", "4,false", "5,false"})
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void differentResultContains(int i, boolean expected) {
        assertEquals(numbers.contains(i), expected);
    }
}

/*
    https://www.baeldung.com/parameterized-tests-junit-5
    https://www.baeldung.com/introduction-to-assertj
    https://joel-costigliola.github.io/assertj/assertj-core-features-highlight.html#exception-assertion
 */