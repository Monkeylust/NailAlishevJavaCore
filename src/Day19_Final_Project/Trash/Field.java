package Day19_Final_Project.Trash;

import java.util.Arrays;
import java.util.Scanner;

public class Field {
    public static final Shapes[][] SHAPES = new Shapes[10][10];
    private Shapes[][] view;

    public Field(Shapes[][] view) {
        this.view = view;
    }

    public void print() {
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view.length; j++) {
                System.out.print(view[i][j].getView());
            }
            System.out.println();
        }
    }

    public static Shapes[][] getShapes(Shapes[][] shapes, Scanner scanner) {
        System.out.println("Введи координаты для однопалубного корабля (фармат: x,y)");
        String string = scanner.nextLine();
        String[] numbersString = string.split(",");
        int[] numbers = new int[numbersString.length];
        int counter = 0;
        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < shapes.length; i++) {
            for (int j = 0; j < shapes.length; j++) {
                shapes[i][j] = Shapes.EMPTY;
                shapes[numbers[0]][numbers[1]] = Shapes.DAMAGE;

            }
        }
        return shapes;
    }

//    public static int[] getHalo(int[] coordinates) {
//        int x = coordinates[0];
//        int y = coordinates[1];
//        int[] number = new int[2];
//
//
//        for (int i = x - 1; i <= x + 1; i++) {
//            number[0] = i;
//            number[1] = y;
//            System.out.println(Arrays.toString(number));
//
//            if (number[0] == 6) {
//                return null;
//            }
//        }
//        return getHalo(new int[] number{x -1, y});
//    }

}