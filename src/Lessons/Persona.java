package Lessons;

public class Persona {
    String name;
    final int AGE = 50;
    double weight;

    public Persona(int weight) {
        this.weight = weight;
    }

    void showInfo() {
        System.out.println(name);
        System.out.println(weight);
    }
}
