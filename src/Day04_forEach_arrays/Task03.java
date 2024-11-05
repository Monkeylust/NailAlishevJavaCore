package Day04_forEach_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        int[] arrayMax = new int[array.length];
        int i, j, counterFindMax, max = 0, maxSum = 0;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                int random = new Random().nextInt(0, 50);
                array[i][j] = random;
                arrayMax[i] += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            System.out.println(arrayMax[i]);
        }
        for (counterFindMax = 0; counterFindMax < arrayMax.length; counterFindMax++) {
            if (arrayMax[counterFindMax] > max) {
                max = arrayMax[counterFindMax];
                maxSum = counterFindMax;
            }
        }
        System.out.println(Arrays.toString(arrayMax));
        System.out.println(max);
        System.out.println("Ответ: " + maxSum + " (индекс строки, сумма чисел в которой максимальна)");
    }
}
// Насоздавал лишних переменных и массив.