package Day16_CastingPrimitiveDataTypes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task02 {
    static final String PATH_NAME_FILE_ONE = "file1";
    static final String PATH_NAME_FILE_TWO = "file2";
    static File fileTwo = new File(PATH_NAME_FILE_TWO);
    static Random random = new Random();
    static int counterStart = 0;
    static int counterFinal = 15;

    public static void main(String[] args) {
        try (PrintWriter pwOne = new PrintWriter("file1");
             Scanner scannerOne = new Scanner(new File(PATH_NAME_FILE_ONE));
             PrintWriter pwTwo = new PrintWriter(fileTwo)) {
            createPwOne(pwOne);
            if (scannerOne.hasNext()) {
                String[] lineNumbersFileOne = scannerOne.nextLine().split(" ");
                printPwTwo(lineNumbersFileOne, pwTwo);
            } else {
                throw new NoSuchElementException();
            }
            printResult(fileTwo);
        } catch (FileNotFoundException e) {
            System.out.println("File is missing!");
        } catch (NoSuchElementException e) {
            System.out.println("File is empty");
        }
    }

    public static void createPwOne(PrintWriter pwOne) {
        StringBuilder sbOne = new StringBuilder();
        for (int i = counterStart; i < counterFinal; i++) {
            sbOne.append(random.nextInt(100)).append(" ");
        }
        pwOne.print(sbOne);
        pwOne.flush();
    }

    public static void printPwTwo(String[] lineNumbersFileOne, PrintWriter pwTwo) {
        StringBuilder sbTwo = new StringBuilder();
        int sum = 0;
        int counter = 0;
        StringBuilder sbTemp = new StringBuilder();
        for (String string : lineNumbersFileOne) {
            if (!isNumber(string)) {
                continue;
            }
            sum += Integer.parseInt(string);
            counter++;
            if (counter >= 5) {
                sbTwo.append(sum / 5.0).append(" ");
                sbTemp.append(sum).append(" ");
                sum = 0;
                counter = 0;
            }
        }
        System.out.println(Arrays.toString(lineNumbersFileOne));
        System.out.println(sbTemp);
        System.out.println(sbTwo);
        pwTwo.print(sbTwo);
        pwTwo.flush();
    }

    public static void printResult(File fileTwo) {
        try (Scanner scanner = new Scanner(fileTwo)) {
            if (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(" ");
                double result = 0;
                for (String string : line) {
                    if (!isNumber(string)) {
                        continue;
                    }
                    result += Double.parseDouble(string);
                }
                System.out.println(result);
                System.out.println((int) result);
            } else {
                throw new NoSuchElementException();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is missing!");
        } catch (NoSuchElementException e) {
            System.out.println("File is empty");
        }
    }

    public static boolean isNumber(String string) {
        return string.matches("-?\\d+");
    }
}