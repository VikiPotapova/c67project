package Lessons;

public class Kitty {
    //1. состояние (характеристики): цвет. попрода
    String breed;
    String color;
    String name;
    int age;
    int weight;

    // контруктор по умолчанию (единственный метод с большой буквы)
    public Kitty() {
        System.out.println("We create a kitty");
    }

    public Kitty(int a) {
        age = a;
    }

    // code - generate - constructor
    public Kitty(String breed, String color, String name, int age, int weight) {
        this.breed = breed;
        this.color = color;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Kitty(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //2. поведение (что он умеет): бегать. мяукать

    // чтоМетодОтдаетКакРезультат имя (параметры){
    // тело метода
    // }
    void makeVoice() {
        System.out.println("Meow meow!!");
    }

    int giveMeAgePlusOneYear() {
        return age + 1;
    }

    void printMeAgePlusOneYear() {
        System.out.println(age + 1);
    }
}
