package Day04_forEach_arrays;

import java.util.Random;

public class Task03Best {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random random = new Random();
        int i, j, maxSum = 0, maxSumIndex = 0;

        for (i = 0; i < array.length; i++) {
            int sum = 0;
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                sum += array[i][j];

                System.out.print(array[i][j] + " ");
                if (sum >= maxSum) {
                    maxSum = sum;
                    maxSumIndex = i;
                }
            }
            System.out.println();
            System.out.println(sum);
        }
        System.out.println("Ответ: " + maxSumIndex + " (индекс строки, сумма чисел в которой максимальна)");
    }
}