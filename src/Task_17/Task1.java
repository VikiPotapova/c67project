package Task_17;

import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
        LocalDate oneHundredYearsOld = dateOfBirth.plusYears(100);
        System.out.println(oneHundredYearsOld);
    }
}
