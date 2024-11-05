package Day02_if_Scanner;

import java.util.Scanner;

public class Task04Serega {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение для расчета - ");
        double x = scan.nextDouble();
        System.out.println(test(x));
    }

    private static double test(double x) {
        double y = 420;
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        } else if (x > -3 && x < 5) {
            y = (x + 3) * (x * x - 2);
        }
        return y;
    }
}