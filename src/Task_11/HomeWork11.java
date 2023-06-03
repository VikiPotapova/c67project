package Task_11;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        // task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 lines:");
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        String[] array = {line1, line2, line3};
        Arrays.sort(array); //уже отсортирован и для второго задания
        System.out.println("The shortest line is: " + array[0]);
        System.out.println("The longest line is: " + array[2]);
        System.out.println("The length of the shortest one is: " + array[0].length());
        System.out.println("The length of the longest one is: " + array[2].length());
        // переделать.

        // task 2
        System.out.println("Sorting: " + Arrays.toString(array));
// надо переделать пузырьком!!!!!!!!!!!

        // task 3
        String newLine = line1.concat(line2) + line3;
        int averageLength = newLine.length() / 3;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < averageLength) {
                System.out.println("Line with length lower than average: " + array[i] + "\n" + "Length: " + array[i].length());
            }
        }

        // task 4
        char[] l1 = line1.toCharArray();
        boolean resultLine1 = true;
        for (int i = 1; i < l1.length; i++) {
            if (l1[i - 1] == l1[i]) {
                resultLine1 = false;
                break;
            }
        }
        System.out.println(resultLine1);
        char[] l2 = line2.toCharArray();
        boolean resultLine2 = true;
        for (int i = 1; i < l2.length; i++) {
            if (l2[i - 1] == l2[i]) {
                resultLine2 = false;
                break;
            }
        }
        System.out.println(resultLine2);
        char[] l3 = line3.toCharArray();
        boolean resultLine3 = true;
        for (int i = 1; i < l3.length; i++) {
            if (l3[i - 1] == l3[i]) {
                resultLine3 = false;
                break;
            }
        }
        System.out.println(resultLine3);
        if (resultLine1 == true) {
            System.out.println(line1);
        } else if (resultLine2) {
            System.out.println(line2);
        } else if (resultLine3 == true) {
            System.out.println(line3);
        } else {
            System.out.println("There are no lines which consist of different symbols");
        }
// переделать в циклф. 1)переборка три цикла (первый символы, второй все кроме него)
        // boolean flag = false;
        //
        // for (String string : array){
        //for (int i = 0; i <string.length-1;i++){
        //for (int j = 0; j <string.length;i++){
        //if(string.charAt(i) != string.charAt(k)){
        //flag = true;
        //else
        // flag = false; break}}

        // task 5
        String str = "Hello";
        str = str.repeat(2);
        char[] a = str.toCharArray();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //переписать у стаса
    }
}


