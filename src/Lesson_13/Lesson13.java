package Lesson_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lesson13 {
    public static void main(String[] args) {
        // подключаемся к базе данных
        // исключения -
        // try-catch. если у нас несколько ошибок в кэтч, то надо по иерархии.в порядке возраст.узкие-широкие. можно в один через |
        // int num = 0;
// error это ошибки, которые возникают в исполняюшей среде и они не могут быть обработаны в программе. сбои. нет памяти.
       /* try {
            System.out.println(10 / num);
        } catch (ArithmeticException e) { //e-exception название объекта, может быть любим
            System.out.println("Some arithmetic exception");
            System.out.println(e.getMessage());
        }
        System.out.println("End of the main method ");*/
        /*int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e);
        } finally { // в любом случае запускается (закроет соединение) но считается необязаетльным.
            // если описать файналли но кэтч н писать программа даст работать, но так не надо. тру катч работает в команде.
            System.out.println(111111);
        }
        try {
            FileInputStream s = new FileInputStream("D:\\file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/
        // исключения можно создавать свои
        int n = 1;
        if (n > 0) {
            throw new MyFirstException("more than 0");
        }
        //trows используется как еще один метод обработки в методе, где выпадает/ но не в мейне! в мейне трай кэтч
    }
}
