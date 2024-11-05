package Day02_if_Scanner;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число a - ");
        int a = scan.nextInt();
        System.out.print("Введите число b - ");
        int b = scan.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        for (int x = ++a; x < b; x++) {
            if (x % 5 == 0 && x % 10 != 0) {
                System.out.print(x + " ");
            }
        }
    }
}