package Lessons;

public class Calculator {
    double weight = 10.5;
    int cost = 100;
    String color = "Black";

    //статический блок
    static {
        System.out.println("static");
    }

    //логический блок (до конструктора, если захотим)/ rarely
    {
        color = "Yellow";
        System.out.println("We are creating calculator");

    }

    public Calculator() {

    }
    //контструктор отличается от метода тем, что пишется с большой буквы, называется как класс, не имеет возвращаемого типа
    public Calculator(double weight, int cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    public long sum(int a, int b) {
        return a + b;
    }

    double del(int a, int b) {
        return (double) a / b;
    }

    int razn(int a, int b) {
        return a - b;
    }

    long umnozh(int a, int b) {
        return (long) a * b;
    }
}
