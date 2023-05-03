import java.util.Scanner;

public class ScannerLesson {
    public static void main(String[] args) {
        // 1.Create
        Scanner scanner = new Scanner(System.in);
        //new = create memory space;

        //2. use the name
        int result = scanner.nextInt();
        scanner.nextLine(); //чтобы не переходило на следующую строку.е
        String result2 = scanner.nextLine();
        System.out.println(result);
        System.out.println(result2);

        /*if (scanner.hasNextInt()) {
            result = scanner.nextInt();*/ //проверка

    }

}
