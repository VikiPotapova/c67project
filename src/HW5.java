import java.util.Arrays;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += numb;
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Home blblbl new 5 branch");
    }
}
