package Day18_Recursion;

public class Task2 {
    static final int NUMBER = 717771237;

    public static void main(String[] args) {
        System.out.println(getTheNumberOfRepeatedDigits(NUMBER));
    }

    static private int getTheNumberOfRepeatedDigits(int digit) {
        int counter = 0;
        if (digit % 10 == 7) {
            counter++;
        }

        if (digit == 0) {
            return counter;
        }

        return counter + getTheNumberOfRepeatedDigits(digit / 10);
    }
}