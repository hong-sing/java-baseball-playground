public class Game {

    // 컴퓨터 숫자 생성
    public int[] generateNum() {
        int first = (int) (Math.random() * 9) + 1;
        int second = (int) (Math.random() * 9) + 1;

        while (first == second) {
            second = (int) (Math.random() * 9) + 1;
        }

        int third = (int) (Math.random() * 9) + 1;
        while (first == third || second == third) {
            third = (int) (Math.random() * 9) + 1;
        }
        int[] arr = new int[3];
        arr[0] = first;
        arr[1] = second;
        arr[2] = third;
        return arr;
    }
}

