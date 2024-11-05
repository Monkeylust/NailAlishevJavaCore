package Day06_methods_typeReturnValueMethod_ParamsMethod;

public class Task01Motorbike {
    private int yearOfRelease;
    private String color;
    private String model;

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - yearOfRelease);
    }

    public Task01Motorbike(int yearOfRelease, String color, String model) {
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}