package Day14_Read_from_file_Exceptions.Task02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainMyCode {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    // Моё решение, предполагал что можно сделать всё в while но не додумался как, вышел только на такое решение.

    public static List<String> parseFileToStringList() {
        List<String> listPeople = new ArrayList<>(); //список в который добавлю строки из файла
        File filePeople = new File("Day14Task02People");
        StringBuilder tempLineForSplit = new StringBuilder(); //стрин билдер для сплита
        try (Scanner scanner = new Scanner(filePeople)) {
            while (scanner.hasNextLine()) {
                listPeople.add(scanner.nextLine()); //заполняю лист
            }
            System.out.println(listPeople + " /// listPeople 1"); //проверка листа
            for (String listPerson : listPeople) {
                tempLineForSplit.append(listPerson).append(" "); //добавляю с листа в стринг билдер для сплита
            }
            System.out.println(tempLineForSplit + " /// tempLineForSplit 2"); //проверка стринг билдера
            String[] peopleArray = tempLineForSplit.toString().split(" "); //сплитую в массив
            System.out.println(Arrays.toString(peopleArray) + " /// peopleArray 3"); //проверка массива
            int[] agePeople = new int[listPeople.size()]; //массив длинной колличеством строк(человек)
            int counterForAgePeople = 0;
            for (int i = 1; i <= peopleArray.length; i += 2) {
                agePeople[counterForAgePeople] += Integer.parseInt(peopleArray[i]);
                if (agePeople[counterForAgePeople] <= 0) {
                    throw new NegativeAgeException();
                }
                counterForAgePeople++;
            }
            System.out.println(Arrays.toString(agePeople) + " /// agePeople 4"); //проверка массива хранящий возраст
        } catch (FileNotFoundException e) {
            System.out.println("File is missing.");
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
        return listPeople;
    }
}