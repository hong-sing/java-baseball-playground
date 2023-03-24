import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Game game = new Game();

    @DisplayName("컴퓨터_숫자_생성")
    @Test
    public void generateNum() {
        int[] arr = game.generateNum();

        assertThat(arr[0]).isNotEqualTo(arr[1]);
        assertThat(arr[0]).isNotEqualTo(arr[2]);
        assertThat(arr[1]).isNotEqualTo(arr[2]);
    }
}