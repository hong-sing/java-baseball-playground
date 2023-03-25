import java.util.Arrays;

public class Game {

    // 컴퓨터 숫자 생성
    public int[] generateNum() {
        int first = generateRandomNum();
        int second = generateRandomNum();
        int third = generateRandomNum();

        while (first == second) {
            second = generateRandomNum();
        }

        while (first == third || second == third) {
            third = generateRandomNum();
        }

        int[] arr = new int[3];
        arr[0] = first;
        arr[1] = second;
        arr[2] = third;
        return arr;
    }

    // 1 ~ 9 사이의 랜덤 숫자 생성
    public int generateRandomNum() {
        int randomNum = (int) (Math.random() * 9) + 1;
        return randomNum;
    }

    // 스트라이크 판별
    boolean isStrike(int computer, int user) {
        return computer == user;
    }

    // 볼 판별
    boolean isBall(int computer1, int computer2, int user) {
        return computer1 == user || computer2 == user;
    }
}

