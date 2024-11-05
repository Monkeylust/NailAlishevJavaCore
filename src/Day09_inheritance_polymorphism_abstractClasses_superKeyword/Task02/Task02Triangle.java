package Day09_inheritance_polymorphism_abstractClasses_superKeyword.Task02;

public class Task02Triangle extends Task02Figure {
    private double long1, long2, long3;

    public Task02Triangle(String color, double long1, double long2, double long3) {
        super(color);
        this.long1 = long1;
        this.long2 = long2;
        this.long3 = long3;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - long1) * (halfPerimeter - long2) * (halfPerimeter - long3));
    }

    @Override
    public double perimeter() {
        return long1 + long2 + long3;
    }
}