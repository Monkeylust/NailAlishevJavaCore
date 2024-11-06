package Day14_Read_from_file_Exceptions.Task01;

public class IncorrectNumberOfNumbersException extends Exception {
    public IncorrectNumberOfNumbersException(){
       System.out.println("Invalid input file, the number of numbers in the file is not equal to 10.");
    }
}