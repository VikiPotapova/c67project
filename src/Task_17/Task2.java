package Task_17;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, -2, 300, -10};
        Predicate<Integer> lambda = x -> x >= 0;
        for (int i = 0; i < array.length; i++) {
            if (lambda.test(array[i])) {
                System.out.println(array[i]);
            }
        }
    }
}
