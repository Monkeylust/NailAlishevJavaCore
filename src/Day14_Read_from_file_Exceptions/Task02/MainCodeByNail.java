package Day14_Read_from_file_Exceptions.Task02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCodeByNail {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        List<String> listPeople = new ArrayList<>();
        File filePeople = new File("Day14Task02People");
        try (Scanner scanner = new Scanner(filePeople)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] array = line.split(" ");
                if (Integer.parseInt(array[1]) <= 0) {
                    throw new NegativeAgeexception();
                }
                listPeople.add(line);
            }
            return listPeople;
        } catch (FileNotFoundException e) {
            System.out.println("File is missing.");
        } catch (NegativeAgeexception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}