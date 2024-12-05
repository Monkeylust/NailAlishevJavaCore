package Day16_CastingPrimitiveDataTypes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        try (PrintWriter pw1 = new PrintWriter("file1");
             Scanner scanner1 = new Scanner(new File("file1"));
             PrintWriter pw2 = new PrintWriter("file2")) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            createPw1(sb1, pw1);
            String[] lineNumbersFile01 = scanner1.nextLine().split(" ");
            createPw2(lineNumbersFile01, sb2, pw2);
            printResult(new File("file2"));
        } catch (FileNotFoundException e) {
            System.out.println("File is missing!");
        }
    }

    public static void createPw1(StringBuilder sb1, PrintWriter pw1) {
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            sb1.append(random.nextInt(100)).append(" ");
        }
        pw1.print(sb1);
        pw1.flush();
    }

    public static void createPw2(String[] lineNumbersFile01, StringBuilder sb2, PrintWriter pw2) {
        int sum = 0;
        int counter = 0;
        StringBuilder sbTemp = new StringBuilder();
        for (String string : lineNumbersFile01) {
            sum += Integer.parseInt(string);
            counter++;
            if (counter == 5) {
                sb2.append(sum / 5.0).append(" ");
                sbTemp.append(sum).append(" ");
                sum = 0;
                counter = 0;
            }
        }
        System.out.println(Arrays.toString(lineNumbersFile01));
        System.out.println(sbTemp);
        System.out.println(sb2);
        pw2.print(sb2);
        pw2.flush();
    }

    public static void printResult(File file02) {
        try (Scanner scanner = new Scanner(file02)) {
            String[] line = scanner.nextLine().split(" ");
            double result = 0;
            for (String string : line) {
                result += Double.parseDouble(string);
            }
            System.out.println(result);
            System.out.println((int) result);
        } catch (FileNotFoundException e) {
            System.out.println("File is missing!");
        }
    }
 }