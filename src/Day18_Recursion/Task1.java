package Day18_Recursion;

import java.util.*;

public class Task1 {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] randomArray = randomArray();
        int sum = recursionSum(randomArray, 0);
        System.out.printf("%s %d \n", "Сумма чисел массива =", sum);
    }

    private static int recursionSum(int[] array, int index) {
        if (index == array.length) {
            System.out.println(Arrays.toString(array));
            return 0;
        }
        return array[index] + recursionSum(array, index + 1);
    }

    private static int[] randomArray() {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] += random.nextInt(100);
        }
        return array;
    }
}