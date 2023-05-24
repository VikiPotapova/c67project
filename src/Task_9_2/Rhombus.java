package Task_9_2;

public class Rhombus extends Figure {
    private double side;
    private double height;

    public Rhombus(double side) {
        this.side = side;
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
