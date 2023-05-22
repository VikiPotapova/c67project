package Lesson8;

public class Devloper {
    public String name;
    public static int salary = 1000;
    public final static int age = 30;  //поле статичное

    {
        System.out.println("Hello from logic block dev");
    }

    static {
        System.out.println("Static Dev");
    }

    public static void sayHello() {
        System.out.println("Hello");
        // System.out.println(name); не получается засунуть поля нестатичные
        System.out.println(age);
    }

    static class Laptop {
        public static String name = "HP";
    }
}
