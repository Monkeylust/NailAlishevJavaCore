package Day05_classes_objects_encapsulation_set_get_accessModifiers;

public class Task02Motorbike {
    private int yearOfRelease;
    private String color;
    private String model;

    public Task02Motorbike(int yearOfRelease, String color, String model) {
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