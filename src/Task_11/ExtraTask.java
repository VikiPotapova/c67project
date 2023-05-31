package Task_11;

import java.util.Scanner;

public class ExtraTask {
    public static void main(String[] args) {
        String phrase = "Ana is a russian girl";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int numberOfWord = scanner.nextInt();
        String[] phraseArray = phrase.split(" ");
        if (numberOfWord <= phraseArray.length && numberOfWord > 0) {
            StringBuilder s = new StringBuilder(phraseArray[numberOfWord - 1]);
            s.reverse();
            String reverseWord = s.toString();
            if (reverseWord.equalsIgnoreCase(phraseArray[numberOfWord - 1])) {
                System.out.println("Palindrom");
            } else {
                System.out.println("Not palindrom");
            }
        }
    }
}
