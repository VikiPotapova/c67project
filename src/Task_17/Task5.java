package Task_17;

import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static void main(String[] args) {
        Supplier<String> reverse = () -> {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        };
        System.out.println(reverse.get());
    }
}
