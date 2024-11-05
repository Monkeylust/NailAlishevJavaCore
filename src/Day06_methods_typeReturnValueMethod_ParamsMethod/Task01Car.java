package Day06_methods_typeReturnValueMethod_ParamsMethod;

public class Task01Car {
    private int yearOfRelease;
    private String color;
    private String model;

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - yearOfRelease);
    }

    public void setYearOfRelease(int carYearOfRelease) {
        yearOfRelease = carYearOfRelease;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }
}