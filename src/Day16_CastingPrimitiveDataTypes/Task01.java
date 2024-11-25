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
            System.out.printf(result + " --> %.3f\n", result);
        } catch (FileNotFoundException e) {
            System.out.println("File is missing!");
        }
    }

    public static int sum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
//            try {
//                sum += Integer.parseInt(number);  //если без методов раскомментировать, доработка вне задания на развитие от Сереги
//            } catch (NumberFormatException e) {
//                System.out.println(number);
//            }
            if (isInteger(number)) {
                sum += Integer.parseInt(number);
            } else {
                System.out.println("Исключение: " + number);
            }
        }
        return sum;
    }

    public static boolean isInteger(String str) { //метод делает проверку строки и игнорирует всё что не положительный int
        return str != null && str.chars().allMatch(Character::isDigit);
    }

    public static boolean isNumber(String str) {
        String regex = "^-?\\d+$";                  //че тут происходит я хз, но этот метод считает отрицательные числа
        return str.matches(regex);                  //и не крашится если записать букву в файл или символ, плюс считает
    }                                               //отрицательные числа
}