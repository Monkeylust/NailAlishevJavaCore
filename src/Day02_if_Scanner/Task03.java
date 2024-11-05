package Day02_if_Scanner;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число a - ");
        int a = scan.nextInt();
        System.out.print("Введите число b - ");
        int b = scan.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        int x = ++a;
        while (x < b) {
            if (x % 5 == 0 && x % 10 != 0)
                System.out.print(x + " ");
            x++;
        }
    }
}