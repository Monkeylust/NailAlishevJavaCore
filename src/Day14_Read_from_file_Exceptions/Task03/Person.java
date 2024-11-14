package Day14_Read_from_file_Exceptions.Task03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    public String toString(){
//        return "%s, %d" .formatted(name, age); //Помню, помню твои учения)
//    }

    public static List<Person> parseFileToObjList(){
        File file = new File("Day14Task02People");
        List<Person> listPerson = new ArrayList<>();
        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String linePerson = scanner.nextLine();
                String[] arrayPerson = linePerson.split(" ");
                validateAge(arrayPerson);
                listPerson.add(new Person(arrayPerson[0], Integer.parseInt(arrayPerson[1])));
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
}