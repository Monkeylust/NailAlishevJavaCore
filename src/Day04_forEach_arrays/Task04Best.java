package Day04_forEach_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task04Best {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int growhtCounterIn = 0; growhtCounterIn < array.length; growhtCounterIn++) {
            int random = new Random().nextInt(0, 10000);
            array[growhtCounterIn] = random;
        }
        System.out.println(Arrays.toString(array));
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
            System.out.print(sum + " ");
        }
        System.out.println();
        System.out.println(maxSumIndex);
        System.out.println(maxSum);
    }
}