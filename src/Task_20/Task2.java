package Task_20;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4, 9, 6, 1, 0, 5, 7, 8};

        Thread th1 = new Thread() {
            @Override
            public void run() {
                int j;
                for (int i = 1; i < arr.length; i++) {
                    int swap = arr[i];
                    for (j = i; j > 0 && swap < arr[j - 1]; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[j] = swap;
                }
                System.out.println("Insertion sort result: " + Arrays.toString(arr));
            }
        };
        Thread th2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < arr.length; i++) {
                    int pos = i;
                    int min = arr[i];
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] < min) {
                            pos = j;
                            min = arr[j];
                        }
                    }
                    arr[pos] = arr[i];
                    arr[i] = min;
                }
                System.out.println("Selection sort result: " + Arrays.toString(arr));
            }
        };
        Thread th3 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < arr.length - 1; i++) {
                    for (int j = 0; j < arr.length - i - 1; j++) {
                        if (arr[j + 1] < arr[j]) {
                            int swap = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = swap;
                        }
                    }
                }
                System.out.println("Bubble sort result: " + Arrays.toString(arr));
            }
        };
        th1.start();
        th2.start();
        th3.start();
    }
}