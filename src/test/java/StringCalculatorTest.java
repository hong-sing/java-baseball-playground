import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    public void beforEach() {
        stringCalculator = new StringCalculator();
    }

    @DisplayName("문자열_분리")
    @Test
    public void splitString() {
        String input = "2 + 3 * 4 / 2";

        String[] strArr = stringCalculator.splitString(input);

        assertThat(strArr).containsExactly("2", "+", "3", "*", "4", "/", "2");
    }

    @DisplayName("문자열을_숫자로")
    @Test
    public void stringToInt() {
        String input = "2";

        int num = stringCalculator.stringToInt(input);

        assertThat(num).isEqualTo(2);
    }

    @DisplayName("더하기")
    @Test
    public void add() {
        int a = 2;
        int b = 3;

        int sum = stringCalculator.add(a, b);

        assertThat(sum).isEqualTo(5);
    }

    @DisplayName("빼기")
    @Test
    public void minus() {
        int a = 5;
        int b = 6;

        int sum = stringCalculator.minus(a, b);

        assertThat(sum).isEqualTo(-1);
    }

    @DisplayName("곱하기")
    @Test
    public void multiply() {
        int a = 3;
        int b = 4;

        int result = stringCalculator.multiply(3, 4);

        assertThat(result).isEqualTo(12);
    }

    @DisplayName("나누기")
    @Test
    public void divide() {
        int a = 20;
        int b = 2;

        double result = stringCalculator.divide(a, b);

        assertThat(result).isEqualTo(10);
    }

    @DisplayName("0으로_나누기")
    @Test
    public void divideZero() {
        int a = 10;
        int b = 0;

        assertThatThrownBy(() -> {
            stringCalculator.divide(a, b);
        }).isInstanceOf(ArithmeticException.class).hasMessage("0으로 나눌 수 없습니다.");
    }

    @DisplayName("+계산")
    @Test
    public void addCal() {
        int a = 2;
        String opr = "+";
        int b = 3;

        int result = stringCalculator.calculate(a, opr, b);

        assertThat(result).isEqualTo(5);
    }

    @DisplayName("-계산")
    @Test
    public void minusal() {
        int a = 2;
        String opr = "-";
        int b = 3;

        int result = stringCalculator.calculate(a, opr, b);

        assertThat(result).isEqualTo(-1);
    }

    @DisplayName("*계산")
    @Test
    public void mulCal() {
        int a = 2;
        String opr = "*";
        int b = 3;

        int result = stringCalculator.calculate(a, opr, b);

        assertThat(result).isEqualTo(6);
    }

    @DisplayName("/계산")
    @Test
    public void divCal() {
        int a = 6;
        String opr = "/";
        int b = 3;

        int result = stringCalculator.calculate(a, opr, b);

        assertThat(result).isEqualTo(2);
    }

    @DisplayName("전체계산")
    @Test
    public void runCalculate() {
        String[] arr = {"2","+","3","*","4","/","2"};

        int result = stringCalculator.runCalculate(arr);

        assertThat(result).isEqualTo(10);
    }
}