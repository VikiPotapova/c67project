package Task_20;

import java.util.Arrays;
import java.util.Scanner;

public class Task1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array length");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }

        Thread t1 = new Thread() {
            @Override
            public void run() {
                Arrays.sort(array);
                System.out.println("Max num is " + array[array.length - 1]);
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                Arrays.sort(array);
                System.out.println("Min num is " + array[0]);
            }
        };
        t1.start();
        t2.start();
    }
}