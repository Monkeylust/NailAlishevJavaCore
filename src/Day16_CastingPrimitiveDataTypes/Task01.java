package Day16_CastingPrimitiveDataTypes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        printResult(new File("Day14Task01"));
    }

    public static void printResult(File file) {
        try (Scanner scanner = new Scanner(file)) {
            String[] numbers = scanner.nextLine().split(" ");
            double result = sum(numbers) / (double) numbers.length;
            System.out.println(Arrays.toString(numbers));
            System.out.printf(result + " --> %.3f", result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static int sum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}