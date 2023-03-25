import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {

    InputView inputView = new InputView();

    @DisplayName("사용자_숫자_분리")
    @Test
    public void splitNum() {
        String num = "345";

        int[] arr = inputView.splitNum(num);

        assertThat(arr).containsExactly(3, 4, 5);
    }

}