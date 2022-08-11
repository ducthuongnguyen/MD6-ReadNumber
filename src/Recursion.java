import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Recursion {
    public static long fibonaci(int n) {
        if (n < 3) {
            return 1;
        }
        return fibonaci(n - 1) + fibonaci(n - 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("So cac chu so trong day fibonaci:");
            int length = input.nextInt();
            for (int i = 1; i <= length; i++) {
                System.out.println("fibonaci(" + i + ")=" + fibonaci(i));
            }
        }
    }
}
