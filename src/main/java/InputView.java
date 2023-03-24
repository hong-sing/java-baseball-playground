import java.util.Scanner;

public class InputView {

    Scanner sc = new Scanner(System.in);

    int[] inputNum() {
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        return arr;
    }
}
