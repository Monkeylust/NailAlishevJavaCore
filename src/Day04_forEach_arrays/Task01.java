package Day04_forEach_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число (размер массива) - ");
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        Random ran = new Random();
        int counterBigNum = 0;
        int counterOne = 0;
        int counterEven = 0;
        int counterNotEven = 0;
        int summ = 0;

        for (int counter = 0; counter < array.length; counter++) {
            int num = ran.nextInt(0, 10);
            array[counter] = num;
            summ += num;
            if (num > 8) {
                counterBigNum++;
            }
            if (num == 1) {
                counterOne++;
            }
            if (num % 2 == 0) {
                counterEven++;
            }
            if (num % 2 != 0) {
                counterNotEven++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + counterBigNum);
        System.out.println("Количество чисел равных 1: " + counterOne);
        System.out.println("Количество четных чисел: " + counterEven);
        System.out.println("Количество нечетных чисел: " + counterNotEven);
        System.out.println("Сумма всех элементов массива: " + summ);
    }
}