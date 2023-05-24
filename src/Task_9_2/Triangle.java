package Task_9_2;

public class Triangle extends Figure {
    private double height;
    private double base;
    private double side1;
    private double side2;

    public Triangle(double base, double side1, double side2) {
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double findSquare() {
        return (base / 2) * height;
    }

    @Override
    double findPerimeter() {
        return base + side1 + side2;
    }
}
