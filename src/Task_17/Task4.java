package Task_17;

import java.util.Scanner;
import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        Consumer<String> converter = (n) -> System.out.println(Double.parseDouble(n) / 2.97);
        Scanner scanner = new Scanner(System.in);
        System.out.print("BYN");
        String byn = scanner.nextLine();
        System.out.print("USD ");
        converter.accept(byn);
    }
}
