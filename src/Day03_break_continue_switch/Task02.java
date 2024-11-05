package Day03_break_continue_switch;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Введите два числа через пробел пример (55 105) - ");
            double divisible = scan.nextDouble();
            double divider = scan.nextDouble();
            if (divider == 0)
                break;
            System.out.println(divisible / divider);
        }
    }
}