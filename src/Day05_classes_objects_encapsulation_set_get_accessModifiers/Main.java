package Day05_classes_objects_encapsulation_set_get_accessModifiers;

public class Main {
    public static void main(String[] args) {

        Task01Car car = new Task01Car();
        car.setYearOfRelease(1992);
        car.setColor("Red");
        car.setModel("Megane 3");

        System.out.println(car.getYearOfRelease());
        System.out.println(car.getColor());
        System.out.println(car.getModel());

        Task02Motorbike motorbike = new Task02Motorbike(1992, "Yellow", "Java");
        System.out.println(motorbike.getYearOfRelease());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getModel());
    }
}