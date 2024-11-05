package Day09_inheritance_polymorphism_abstractClasses_superKeyword.Task02;

public abstract class Task02Figure {
    private String color;

    public Task02Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();
}