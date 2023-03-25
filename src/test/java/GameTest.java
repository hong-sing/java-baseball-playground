import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {

    Game game = new Game();
    int[] arr = new int[3];
    @BeforeEach
    public void set() {
        arr = game.generateNum();
    }

    @DisplayName("컴퓨터_숫자_생성")
    @Test
    public void generateNum() {

        assertThat(arr[0]).isNotEqualTo(arr[1]);
        assertThat(arr[0]).isNotEqualTo(arr[2]);
        assertThat(arr[1]).isNotEqualTo(arr[2]);
    }

    @Test
    public void 숫자_범위_확인() {

        assertThat(arr[0]).isGreaterThanOrEqualTo(1).isLessThanOrEqualTo(9);
        assertThat(arr[1]).isGreaterThanOrEqualTo(1).isLessThanOrEqualTo(9);
        assertThat(arr[2]).isGreaterThanOrEqualTo(1).isLessThanOrEqualTo(9);
    }

    @DisplayName("스트라이크_판별")
    @Test
    public void isStrike() {
        int computer = 2;
        int user = 2;

        assertThat(game.isStrike(computer, user)).isTrue();
    }
}