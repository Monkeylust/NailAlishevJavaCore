package Day18_Recursion;

import java.util.*;

public class Task1 {
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.printf("%s %d \n", "Сумма чисел массива =", recursionSum(randomArray(), randomArray().length - 1));
    }

    private static int recursionSum(int[] randomArray, int numbers) {
        int sum = 0;
        if (numbers < 0) {
            System.out.println(Arrays.toString(randomArray));
            return sum;
        }
        sum += randomArray[numbers];
        return sum + recursionSum(randomArray, numbers - 1);
    }

    private static int[] randomArray() {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] += random.nextInt(100);
        }
        return array;
    }
}