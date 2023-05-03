import java.sql.SQLOutput;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        // задание 1 :
       /* int month = 16;
        switch (month) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
            case 9:
                System.out.println("Fall");
                break;
            case 10:
                System.out.println("Fall");
            case 11:
                System.out.println("Fall");
                break;
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Not found");
        }*/

        // задание 2 :
        /*int month = 3;
        if (month > 0 && month <= 2 || month == 12) {
            System.out.println("Winter");
        } else if (month > 2 && month <= 5) {
            System.out.println("Spring");
        } else if (month > 5 && month <= 8) {
            System.out.println("Summer");
        } else if (month > 8 && month <= 11) {
            System.out.println("Fall");
        } else {
            System.out.println("Not found");
        }*/

        // задание 3 :
        /*int num = 5;
        if (num % 2 == 0) {
            System.out.println("Chetnoe");
        } else {
            System.out.println("Nechetnoe");
        }*/

        // задание 4 :
        /*int t = 10;
        if (t > -5) {
            System.out.println("Teplo");
        } else if (t <= -5 && t > -20) {
            System.out.println("Normalno");
        } else if (t <= -20) {
            System.out.println("Xolodno");
        } else {
            System.out.println("Not found");
        }*/

        // задание 1 :
       /* for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }*/

        // задание 2 :
       /* for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }*/

        // задание 3 :
        /*Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = num * (num + 1) / 2;
        System.out.println(sum);*/


        // задание 4 :
        /*int num = 7;
        int result = 0;
        int i = 1;
        while (i < 15) {
            result = i * num;
            System.out.print(result + " ");
            i++;
        }*/

        // задание 5 :
       /* for (int i = 0; i >= -45; i--) {
            if (i % 5 == 0 || i == 0) {
                System.out.print(i + " ");
            }
        }*/

        // задание 6 :
        /*for (int i = 10; i <=20; i++){
            System.out.println(i*i);
        }*/
    }
}
