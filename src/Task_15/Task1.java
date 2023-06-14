package Task_15;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line of random numbers");
        String str = scanner.nextLine();
        String[] array = str.split("\\W\\s*");
        HashSet <String> hash = new HashSet<>();
        Collections.addAll(hash, array);
        System.out.println(hash);
    }
}
