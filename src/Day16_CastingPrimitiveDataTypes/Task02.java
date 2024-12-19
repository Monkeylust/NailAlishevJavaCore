package Day16_CastingPrimitiveDataTypes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task02 {
  private static final int LENGTH_FIRST_FILE = 15;
  private static final int MAX_VALUE = 100;
  private static final int COUNT_FOR_AVERAGE = 5;
  private static final String DELIMITER = " ";
  private static final String ERROR_MSG = "File is missing!";
  private static final File firstFile = new File("file1");
  private static final File secondFile = new File("file2");

  public static void main(String[] args) {
    startProgram();
  }

  private static void startProgram() {

    try {
      String firstData = createDataForFirstFile();
      writeData(firstData, firstFile);
      String secondData = createDataForSecondFile();
      writeData(secondData, secondFile);
      printResult();

    } catch (FileNotFoundException e) {
      System.out.println(ERROR_MSG);
    }
  }

  private static String createDataForFirstFile() {
    Random random = new Random();
    StringBuilder data = new StringBuilder();

    for (int i = 0; i < LENGTH_FIRST_FILE; i++) {
      data.append(random.nextInt(MAX_VALUE));

      if (i + 1 < LENGTH_FIRST_FILE) {
        data.append(DELIMITER);
      }
    }

    return data.toString();
  }

  private static String createDataForSecondFile() throws FileNotFoundException {
    int sum = 0;
    int counter = 0;
    StringBuilder data = new StringBuilder();
    String[] lineNumbers = readFile(firstFile);

    for (String string : lineNumbers) {
      sum += Integer.parseInt(string);

      if (++counter >= COUNT_FOR_AVERAGE) {
        data.append(sum / COUNT_FOR_AVERAGE).append(DELIMITER);
        sum = 0;
        counter = 0;
      }
    }

    return data.toString();
  }

  private static String[] readFile(File file) throws FileNotFoundException {
    try (Scanner scan = new Scanner(file)) {
      return scan.nextLine().split(DELIMITER);
    }
  }

  private static void writeData(String data, File file) throws FileNotFoundException {
    try (PrintWriter pw = new PrintWriter(file)) {
      pw.print(data);
      pw.flush();
    }
  }

  public static void printResult() throws FileNotFoundException {
    System.out.println(calculateResult());
  }

  private static double calculateResult() throws FileNotFoundException {
    String[] line = readFile(secondFile);
    double result = 0;
    for (String string : line) {
      result += Double.parseDouble(string);
    }
    return result;
  }

}