package Day14_Read_from_file_Exceptions.Task01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printSumDigits(new File("Day14Task01"));
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length != 10) {
                throw new IncorrectNumberOfNumbersException();
            }
            int[] numbersArrayStatic = new int[numbersString.length]; //Вариант с массивом
            //List<Integer> numbersArrayDynamic = new ArrayList<>(); //Вариант с динамическим массивом
            int counterStatic = 0;
            int sumStatic = 0;
            //int sumDynamic = 0;
            for (String number : numbersString) {
                numbersArrayStatic[counterStatic++] = Integer.parseInt(number);
                //numbersArrayDynamic.add(Integer.parseInt(number));
                sumStatic += Integer.parseInt(number);
                //sumDynamic += Integer.parseInt(number);
            }
            System.out.println(Arrays.toString(numbersArrayStatic));
            //System.out.println(numbersArrayDynamic);
            System.out.println(sumStatic);
            //System.out.println(sumDynamic);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is missing.");
        } catch (IncorrectNumberOfNumbersException e) {
        }
    }
}