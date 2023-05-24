package Task_9_2;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
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
