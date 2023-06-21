package Task_17;

import java.util.Scanner;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Function<String, Double> currencyConverter = (x) -> Double.parseDouble(x) / 2.97;
        Scanner scanner = new Scanner(System.in);
        System.out.print("BYN");
        String byn = scanner.nextLine();
        System.out.println("USD " + currencyConverter.apply(byn));
    }
}
