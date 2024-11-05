package Day05_classes_objects_encapsulation_set_get_accessModifiers;

public class Task01Car {
    private int yearOfRelease;
    private String color;
    private String model;

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