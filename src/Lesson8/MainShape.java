package Lesson8;

public class MainShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.drow();
        shape.erase();
        Circle circle = new Circle();
        circle.drow();
        circle.erase();
        Triangale triangle = new Triangale();
        triangle.drow();
        triangle.erase();
        Square square = new Square();
        square.drow();
        square.erase();
    }
}
