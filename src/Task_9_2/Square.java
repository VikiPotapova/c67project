package Task_9_2;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double findSquare() {
        return Math.pow(side, 2);
    }

    @Override
    double findPerimeter() {
        return 4 * side;
    }
}
