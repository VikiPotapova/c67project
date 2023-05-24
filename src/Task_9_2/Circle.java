package Task_9_2;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double findSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double findPerimeter() {
        return 2 * Math.PI * radius;
    }
}
