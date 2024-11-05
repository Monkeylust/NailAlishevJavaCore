package Day14_Read_from_file_Exceptions.Task01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printSumDigits(new File("temp"));
    }

    public static void printSumDigits(File file) {
        File file01 = new File("Day14Task01.txt");
        try {
            Scanner scanner = new Scanner(file01);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length != 10) {
                throw new IOException();
            }
            List<Integer> numbers = new ArrayList<>();
            int sum = 0;
            for (String number : numbersString) {
                numbers.add(Integer.parseInt(number));
                sum += Integer.parseInt(number);
            }
            System.out.println(numbers);
            System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is missing.");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл, в файл записано колличество чисел неравное 10.");
        }
    }
}