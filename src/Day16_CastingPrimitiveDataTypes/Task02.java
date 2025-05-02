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
             Scanner scanner = new Scanner(new File(PATH_NAME_FILE_ONE));
             PrintWriter pwTwo = new PrintWriter(fileTwo)) {
            writeArray(pwOne);
            if (scanner.hasNext()) {
                String[] lineNumbersFileOne = scanner.nextLine().split(" ");
                printPwTwo(lineNumbersFileOne, pwTwo);
            } else {
                throw new NoSuchElementException();
            }
            printResult(calculateResult(fileTwo));
        } catch (FileNotFoundException e) {
            System.out.println("File is missing!");
        } catch (NoSuchElementException e) {
            System.out.println("File is empty");
        }
    }

    private static StringBuilder generateLineNumbers(int counterStart, int counterFinal) {
        StringBuilder sb = new StringBuilder();
        for (int i = counterStart; i < counterFinal; i++) {
            sb.append(random.nextInt(100)).append(" ");
        }
        return sb;
    }

    private static void writeArray(PrintWriter pw) {
        pw.print(generateLineNumbers(counterStart, counterFinal));
        pw.flush();
    }

    private static void printPwTwo(String[] lineNumbersFile, PrintWriter pw) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int counter = 0;
        StringBuilder sbTemp = new StringBuilder();
        for (String string : lineNumbersFile) {
            if (!isNumber(string)) {
                continue;
            }
            sum += Integer.parseInt(string);
            counter++;
            if (counter >= 5) {
                sb.append(sum / 5.0).append(" ");
                sbTemp.append(sum).append(" ");
                sum = 0;
                counter = 0;
            }
        }
        System.out.println(Arrays.toString(lineNumbersFile));
        System.out.println(sbTemp);
        System.out.println(sb);
        pw.print(sb);
        pw.flush();
    }

    private static double calculateResult(File file) {
        double result = 0;
        try (Scanner scanner = new Scanner(file)) {
            if (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(" ");
                for (String string : line) {
                    if (!isNumber(string)) {
                        continue;
                    }
                    result += Double.parseDouble(string);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is missing!");
        } catch (NoSuchElementException e) {
            System.out.println("File is empty");
        }
        return result;
    }

    private static boolean isNumber(String string) {
        return string.matches("-?\\d+(\\.\\d+)?");
    }

    private static void printResult(double result) {
        System.out.println(calculateResult(fileTwo));
        System.out.println((int) result);
    }
}