import java.util.Arrays;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
            System.out.print(array[i] + " ");
        }
        //task 1
        /*for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }*/

        //task 2
       /* int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min = " + min);
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max = " + max);*/

        //task 3
       /* int minimum = array[0];
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
                indexOfMin = i;
            }
        }
        System.out.println("Index of min= " + indexOfMin);
        int maximum = array[0];
        int indexOfMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
                indexOfMax = i;
            }
        }
        System.out.println("Index of max= " + indexOfMax);*/

        //task 4
        /*int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                amount++;
            }
        }
        System.out.println();
        if (amount > 0) {
            System.out.println(amount);
        } else {
            System.out.println("Not found");
        }*/

        //task 5
        /*System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
            System.out.print(Arrays.toString(array));*/

        //task 6
        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                System.out.println("True");
            } else {
                System.out.println("False");
                break;
            }
        }

    }
}
