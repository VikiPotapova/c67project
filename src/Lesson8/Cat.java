package Lesson8;

public class Cat extends Animal{
    @Override // аннотация .. переопрделение
    void makeSound() {
        System.out.println("Meow");
    }
}
