package Lesson8;

public class Main {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        Animal animal = new Cat();
        animal.makeSound();
    }
}
