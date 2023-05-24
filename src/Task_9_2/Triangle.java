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

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
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
