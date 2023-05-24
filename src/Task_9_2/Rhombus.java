package Task_9_2;

public class Rhombus extends Figure {
    private double side;
    private double height;

    public Rhombus(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    @Override
    double findSquare() {
        return side * height;
    }

    @Override
    double findPerimeter() {
        return 4 * side;
    }
}
