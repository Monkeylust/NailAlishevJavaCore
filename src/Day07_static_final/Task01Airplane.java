package Day07_static_final;

public class Task01Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public String info() {
        //System.out.printf("%s %d %d %d %d\n", producer, year, length, weight, fuel);
        return "%s %d %d %d %d".formatted(producer, year, length, weight, fuel);
    }

    public static void compareAirplanes(Task01Airplane su, Task01Airplane tu) {
        if (su.getLength() > tu.getLength()) {
            System.out.printf("Длиннее самолет %s, его длинна состовляет %d\n", su.getProducer(), su.getLength());
        }
        else {
            System.out.printf("Длиннее самолет %s, его длинна состовляет %d\n", tu.getProducer(), tu.getLength());
        }
    }

    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }

    public Task01Airplane(String producer, int year, int length, int weight) {
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

    public int getLength() { return length; }

    public String getProducer() { return producer; }
}