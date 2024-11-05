package Day02_if_Scanner;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число этажей в здании.");
        int floor = scan.nextInt();
        if (floor > 1 && floor < 5) {
            System.out.println("Малоэтажный дом");
        } else if (floor > 4 && floor < 9) {
            System.out.println("Среднеэтажный дом");
        } else if (floor > 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}