package Task_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraTask12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String line = scanner.nextLine();
        Pattern pattern1 = Pattern.compile("\\w+([\\.\\-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
        Matcher matcher1 = pattern1.matcher(line);
        while (matcher1.find()) {
            System.out.println("email: " + matcher1.group());
        }
        Pattern pattern2 = Pattern.compile("[\\+]?[\\(]?\\d{2}[\\)]?\\d{7}$");
        Matcher matcher2 = pattern2.matcher(line);
        while (matcher2.find()) {
            System.out.println("phone number: " + matcher2.group());
        }
        Pattern pattern3 = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Matcher matcher3 = pattern3.matcher(line);
        while (matcher3.find()) {
            System.out.println("document number: " + matcher3.group());
        }
    }
}
