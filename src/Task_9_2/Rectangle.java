package Task_9_2;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double findSquare() {
        return length * width;
    }

    @Override
    double findPerimeter() {
        return 2 * (length + width);
    }
}
