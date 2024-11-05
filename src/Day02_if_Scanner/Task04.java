package Day02_if_Scanner;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение для расчета - ");
        double x = scan.nextDouble();
        double y;
        if (x >= 5)
            y = (Math.pow(x, 2) - 10) / (x + 7);
        else if (x > -3 && x < 5)
            y = (x + 3) * (Math.pow(x, 2) - 2);
        else
            y = 420;
        System.out.println(y);
    }
}