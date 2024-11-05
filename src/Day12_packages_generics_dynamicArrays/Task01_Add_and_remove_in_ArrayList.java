package Day12_packages_generics_dynamicArrays;

import java.util.ArrayList;
import java.util.List;

public class Task01_Add_and_remove_in_ArrayList {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Nissan");
        cars.add("Lada");
        cars.add("Renault");
        cars.add("Lexus");
        cars.add("Honda");
        System.out.println(cars);

        cars.add(2, "KIA");
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);
    }
}