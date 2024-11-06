package Day14_Read_from_file_Exceptions.Task01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final int STANDARD_LENGTH_ARRAY = 10;

    public static void main(String[] args) {
        printSumDigits(new File("Day14Task01"));
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length != STANDARD_LENGTH_ARRAY) {
                throw new IncorrectNumberOfNumbersException();
            }
            int[] numbersArrayStatic = new int[numbersString.length]; //Вариант с массивом
            //List<Integer> numbersArrayDynamic = new ArrayList<>(); //Вариант с динамическим массивом
            int sumStatic = 0;
            //int sumDynamic = 0;
            for (int i = 0; i < numbersString.length; i++) {
                numbersArrayStatic[i++] = Integer.parseInt(numbersString[i]);
                //numbersArrayDynamic.add(Integer.parseInt(numbersString[i]));
                sumStatic += Integer.parseInt(numbersString[i]);
                //sumDynamic += Integer.parseInt(numbersString[i]);
            }
            System.out.println(Arrays.toString(numbersArrayStatic));
            //System.out.println(numbersArrayDynamic);
            System.out.println(sumStatic);
            //System.out.println(sumDynamic);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is missing.");
        } catch (IncorrectNumberOfNumbersException e) {
            System.out.println(e.getMessage());
        }
    }
}