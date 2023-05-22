package Lesson8;

public class Person {
    final static String name;

    static {
        name = "Viki";
    }

    static void show() {
        System.out.println(name);
    }
}
