package Day03_break_continue_switch;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        while (counter < 5) {
            System.out.print("Введите два числа делимое и делитель пример (55 105) - ");
            double divisible = scan.nextDouble();
            double divider = scan.nextDouble();
            counter++;
            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(divisible / divider);
        }
    }
}