import java.util.Scanner;

public class InputView {
    Scanner sc = new Scanner(System.in);

    String inputNum() {
        return sc.nextLine();
    }

    int[] splitNum(String num) {
        String[] arr = num.split("");
        int[] arrNum = new int[3];
        for (int i = 0; i < 3; i++) {
            arrNum[i] = Integer.parseInt(arr[i]);
        }
        return arrNum;
    }
}
