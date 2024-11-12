package Day14_Read_from_file_Exceptions.Task02;

public class NegativeAgeException extends Exception {
    private static final String DESCRIPTION = "Invalid age";

    public NegativeAgeException() {
        super(DESCRIPTION);
    }
}