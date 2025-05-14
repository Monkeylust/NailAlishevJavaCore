package Day19_Final_Project.Trash;

import java.util.Arrays;
import java.util.Scanner;

public class SeaWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Field field = new Field(Field.getShapes(Field.SHAPES, scanner));
        field.print();
        // System.out.println((Arrays.toString(Field.getHalo(new int[]{5, 8}))));
    }


}