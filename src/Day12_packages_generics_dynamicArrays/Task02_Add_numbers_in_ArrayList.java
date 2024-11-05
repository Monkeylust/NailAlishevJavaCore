package Day12_packages_generics_dynamicArrays;

import java.util.ArrayList;
import java.util.List;

public class Task02_Add_numbers_in_ArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int counter = 0; counter <= 30; counter++) {
            if (counter % 2 == 0) {
                numbers.add(counter);
            }
        }

        for (int counter2 = 300; counter2 <= 350; counter2++) {
            if (counter2 % 2 == 0) {
                numbers.add(counter2);
            }
        }
        System.out.println(numbers);
    }
}