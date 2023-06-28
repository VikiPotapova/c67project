package Lesson_16;

import java.util.Objects;

public class MainGenerics {
    public static void main(String[] args) {
        // Generic<Integer> o = new Generic<>();
        // Generic <Integer,Person> ex = new Generic<>;
    }
    static <T> Integer hashSum (T ... objects){
        int sum = 0;
        for(T o: objects){
            sum = sum + o.hashCode();
        }
        return sum;
    }
}
// массив примитивов в коллекцию????
