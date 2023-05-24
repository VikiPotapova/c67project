package lesson_9;

// абстрактный класс мсожет(и может не) иметь абстрактные методы
public abstract class Fruit { // этот класс не может создавать объекты. обычно создаются родителями классов
    private int cost;

    public Fruit(int cost) {
        this.cost = cost;
    }

    public void sayHello() {
        System.out.println("hello");
    }

    abstract void describeTaste();
}

