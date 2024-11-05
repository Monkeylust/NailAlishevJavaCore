package Day04_forEach_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int numMax = 0;
        int numMin = 10000;
        int zeroFin = 0;
        int summ = 0;
        for (int counter = 0; counter < array.length; counter++) {
            int random = new Random().nextInt(0, 10000);
            array[counter] = random;
        }
        for (int counterNum : array) {
            if (counterNum > numMax) {
                numMax = counterNum;
            }
            if (counterNum < numMin) {
                numMin = counterNum;
            }
            if (counterNum % 10 == 0) {
                zeroFin++;
            }
            if (counterNum % 10 == 0) {
                summ += counterNum;
            }
        }
        System.out.println("наибольший элемент массива - " + numMax);
        System.out.println("наименьший элемент массива - " + numMin);
        System.out.println("количество элементов массива, оканчивающихся на 0 - " + zeroFin);
        System.out.println("сумму элементов массива, оканчивающихся на 0 - " + summ);
        System.out.println(Arrays.toString(array));
    }
}