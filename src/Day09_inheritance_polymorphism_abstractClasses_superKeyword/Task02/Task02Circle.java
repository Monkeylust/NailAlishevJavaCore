package Day09_inheritance_polymorphism_abstractClasses_superKeyword.Task02;

public class Task02Circle extends Task02Figure {
    private double radius;

    public Task02Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
