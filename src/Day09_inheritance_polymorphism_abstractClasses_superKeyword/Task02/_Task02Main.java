package Day09_inheritance_polymorphism_abstractClasses_superKeyword.Task02;

public class _Task02Main {
    public static void main(String[] args) {
        Task02Figure[] figures = {
                new Task02Triangle("Red", 10, 10, 10),
                new Task02Triangle("Green", 20, 30, 10),
                new Task02Triangle("Red", 20, 15, 10),
                new Task02Rectangle("Red", 10, 5),
                new Task02Rectangle("Orange", 15, 40),
                new Task02Circle("Red", 4),
                new Task02Circle("Red", 10),
                new Task02Circle("Blue", 5)
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Task02Figure[] figures) {
        double sumPerimeter = 0;
        for (int counter = 0; counter < figures.length; counter++) {
            if (figures[counter].getColor().equals("Red")) {
                sumPerimeter += figures[counter].perimeter();
            }
        }
        return sumPerimeter;
    }

    public static double calculateRedArea(Task02Figure[] figures) {
        double sumArea = 0;
       for (Task02Figure figure : figures) {
           if (figure.getColor().equals("Red")) {
               sumArea += figure.area();
           }
        }
        return sumArea;
    }
}