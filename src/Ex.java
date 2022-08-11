import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
    calculate(456);
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap a:");
//        int a = input.nextInt();
//        System.out.println("Nhap b:");
//        int b = input.nextInt();
        //Tinh a mu b
//        System.out.println("a mu b:"+ Math.pow(a,b));
        //Tinh can bac b cua a
//        System.out.println("can bac b cua a:" + Math.pow(a, (1.0 / b)));
    }

    public static void sum() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap x:");
            int x = input.nextInt();
            int sum = 0;
            for (int i = 0; i < x; i++) {
                sum += i;
            }
            System.out.println("Sum=" + sum);
        }
    }

    //Nhap toa do 2 diem tren mat phang M(x1,y1) va N(x2,y2), tinh do dai doan MN
    public static void length() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap to do cua diem M:");
        System.out.println("Nhap x1:");
        double x1 = input.nextDouble();
        System.out.println("Nhap y1:");
        double y1 = input.nextDouble();
        System.out.println("Nhap to do cua diem N:");
        System.out.println("Nhap x2:");
        double x2 = input.nextDouble();
        System.out.println("Nhap y2:");
        double y2 = input.nextDouble();
        System.out.println("Do dai MN:" + Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    public static void calculate(int number){
        String temp = String.valueOf(number);
        String first = temp.substring(0,1);
        String last = temp.substring(temp.length()-1,temp.length());
        System.out.println("Tich:" + Integer.parseInt(first)* Integer.parseInt(last));
    }
}
