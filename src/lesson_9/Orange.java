package lesson_9;

public class Orange extends Fruit {
    public Orange(int cost) {
        super(cost);
    }

    @Override
    void describeTaste() {
        System.out.println("mmmm");
    }
}
