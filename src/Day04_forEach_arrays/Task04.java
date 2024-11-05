package Day04_forEach_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int growhtCounterIn = 0; growhtCounterIn < array.length; growhtCounterIn++) {
            int random = new Random().nextInt(0, 10000);
            array[growhtCounterIn] = random;
        }
        System.out.println(Arrays.toString(array));
        int counter;
        int ar0 = 0;
        int ar1 = 1;
        int ar2 = 2;
        int max = 0;
        int startMaxIndex = 0;
        int[] sum = new int[array.length - 2];
        for (counter = 0; counter < array.length - 2; counter++) {
            sum[counter] = array[ar0] + array[ar1] + array[ar2];
            ar0++;
            ar1++;
            ar2++;
            if (sum[counter] > max) {
                max = sum[counter];
                startMaxIndex = counter;
            }
        }
        System.out.println(Arrays.toString(sum));
        System.out.println(max);
        System.out.println(startMaxIndex);
    }
}
// Насоздавал лишних переменных и массив.