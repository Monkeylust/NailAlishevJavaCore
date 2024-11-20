package Day15_WritingToAFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) throws FileNotFoundException {
        lineParse();
    }

    static public void lineParse() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("Shoes"));
             PrintWriter pw = new PrintWriter("missingShoes")) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (shoeCheckEqualToZero(line)) {
                    pw.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static public boolean shoeCheckEqualToZero(String line) {
        String[] shoes = line.split(", ");
        return Integer.parseInt(shoes[2]) <= 0;
    }
}