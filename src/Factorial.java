import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//tinh giai thua
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Nhap so can tinh giai thua: ");
            Long x = input.nextLong();
            Long result = 1L;
            for (int i = 1; i <= x; i++) {
                result *= i;
            }
            System.out.println("Ket qua:" + result);
        }

    }
}
