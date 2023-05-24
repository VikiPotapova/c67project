package Task_9_2;

public class MainFigure {
    public static void main(String[] args) {
        Figure[] figure = new Figure[5];
        figure[0] = new Triangle(12.5, 5, 6.3);
        figure[1] = new Rectangle(16.4, 10);
        figure[2] = new Square(20.2);
        figure[3] = new Rhombus(5.8);
        figure[4] = new Circle(15);

        for (int i = 0; i < 5; i++) {
            System.out.println(figure[i].findPerimeter());
        }

    }
}