package Day01_while_for_variables_String;

public class Task04 {
    public static void main(String[] args) {
        int year = 1980;
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }
    }
}