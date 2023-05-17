package Task7;

import java.lang.reflect.Field;

public class MainApple {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.getColor());

        try {
            Field field = apple.getClass().getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple, (String) "Blue");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(apple.getColor());
    }
}
