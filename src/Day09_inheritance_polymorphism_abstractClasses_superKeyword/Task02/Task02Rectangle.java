package Day09_inheritance_polymorphism_abstractClasses_superKeyword.Task02;

public class Task02Rectangle extends Task02Figure {
    private double width, height;

    public Task02Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}