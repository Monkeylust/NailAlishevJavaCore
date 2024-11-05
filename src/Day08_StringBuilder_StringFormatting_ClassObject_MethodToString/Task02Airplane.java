package Day08_StringBuilder_StringFormatting_ClassObject_MethodToString;

public class Task02Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public String info() {
        //System.out.printf("%s %d %d %d %d\n", producer, year, length, weight, fuel);
        return "%s %d %d %d %d".formatted(producer, year, length, weight, fuel);
    }

    public String toString() {
        return "%s %d %d %d %d".formatted(producer, year, length, weight, fuel);
    }

    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }

    public Task02Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }
}