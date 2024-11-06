package Day14_Read_from_file_Exceptions.Task01;

public class IncorrectNumberOfNumbersException extends Exception {
    private static final String DESCRIPTION = "Invalid input file, the number of numbers in the file is not equal to 10.";

    public IncorrectNumberOfNumbersException() {
        super(DESCRIPTION);
    }
}