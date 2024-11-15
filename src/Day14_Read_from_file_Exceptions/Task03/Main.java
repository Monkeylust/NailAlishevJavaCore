package Day14_Read_from_file_Exceptions.Task03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }

    public static List<Person> parseFileToObjList() {
        File file = new File("Day14Task02People");
        List<Person> listPerson = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String linePerson = scanner.nextLine();
                String[] arrayPerson = linePerson.split(" ");
                validateAge(arrayPerson);
                listPersonAdd(listPerson, arrayPerson);
            }
            return listPerson;
        } catch (FileNotFoundException e) {
            System.out.println("File is missing.");
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }

    public static void validateAge(String[] arrayPerson) throws NegativeAgeException {
        if (Integer.parseInt(arrayPerson[1]) <= 0) {
            throw new NegativeAgeException();
        }
    }

    public static void listPersonAdd(List<Person> listPerson, String[] arrayPerson) {
        listPerson.add(new Person(arrayPerson[0], Integer.parseInt(arrayPerson[1])));
    }
}