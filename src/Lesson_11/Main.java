package Lesson_11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        String line = "Group 67!";

        // System.out.println("hello".equals(line)); // строку можно писать как угодно
        // System.out.println(line.length()); // длина
        // System.out.println(line.trim()); // убирает лишние пробелы убирает со всех сторон пробелы
        // System.out.println(line.stripLeading()); // убирает пробелы слева
        // System.out.println(line.stripTrailing()); // убирает пробелы справа
        // System.out.println(line.charAt(0)); // символ по индексу, от 0.
        // System.out.println(line.indexOf("p")); //находит индекс по символу
        // System.out.println(line.concat(" We are learning Java")); // метод прибавляет к строке строку.
        // System.out.println(line.substring(3)); // вырезается от n-го символа и далее
        // System.out.println(line.substring(2, 5)); // вырезается с такого-то по такой
        // System.out.println(line.equals("group 67")); // возвращает булево значение
        // System.out.println(line.compareTo("Group 67!")); //возвращает 0 если тру, другое число если фолс.
        // System.out.println(line.toUpperCase()); // все переводит в верхний регистр
        // System.out.println(line.toLowerCase()); // все переводит в нижний регистр
        // System.out.println(line.equalsIgnoreCase("GrOuP 67!")); // сравнивает, игнорируя регистры.
        // System.out.println(line.replace("6","8")); // меняет один символ на другой
        // System.out.println(line.replaceAll("[0-9]{3}", "8"));//ищет цифры от 0 до 9 которые повторяются 3 раза
        // System.out.println(Arrays.toString(line.getBytes()));// преобразует в массив байтов
        // char[] a = line.toCharArray();// преобразует в массив символьных
        // System.out.println(Arrays.toString(line.split(" "))); // мы выбрали пробел, поэтому вернет массив каждого отдельного слова
        // System.out.println(line.startsWith("Group"));
        // System.out.println(line.endsWith("!"));
        // System.out.println(line.contains("Gr")); // проверка, сожержит ли строка символ
        // System.out.println(" ".isBlank()); // проверяет на пустоту и считает пробел тоже пустотой
        // System.out.println(" ".isEmpty()); // проверяет на пустоту, но пробел считае уже символом
        // System.out.println(line.intern()); // перемещает в String Pool
        //System.out.println(line.repeat(3)); // повторяет строку сколько угодно раз мы укажем


        // место где хранятся строки - в куче в String pool. Но можно создать как и обычный объект.
        // т.к. объекты String неизменяемы, то создается постоянно новая строка, даже при изменении. Но если объет уже имеется,
        // то будет на него и ссылаться.

       /* String simpleLine = new String("Hello");
        String line2 = "Hello";
        System.out.println(simpleLine == line2);
        System.out.println(simpleLine.equals(line2)); // у стринга уже переопределен икуалсс.
        simpleLine = simpleLine.intern(); // перемещает в пул строк.
        System.out.println(simpleLine == line2);*/

       /* String block = """
                Hello world!
                How are you?
                """;
        System.out.println(block);
        System.out.println("bla" + 123);
        String six = String.valueOf(6);*/ // преобразует что-то в строку! через класс и точку обращаемся, метод статик
       /* String str = "We are the champions!";
        String str2 = " Exactly ";
        System.out.println(str + str2);
        System.out.println(str.concat(str2));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str2.substring(3));
        System.out.println(str.length());
        System.out.println(str.indexOf("a"));
        System.out.println(String.valueOf(true)); //1/6
        System.out.println(str2.toUpperCase());
        System.out.println(str.replace("!", "?"));
        System.out.println(str2.trim());
        System.out.println(str.isEmpty());
        System.out.println(str2.isBlank());
        System.out.println(Arrays.toString(str.split(" ")));*/

        // String, StringBuilder, StringBuffer - классы, кот-е работают со строками
        /*StringBuilder srtBilLine = new StringBuilder("Hello world");
        String a = "Hello world";
        System.out.println(srtBilLine.equals(a));
        srtBilLine.append("This is the end of the line"); //добавить в конец строки
        srtBilLine.delete(4, 7); // удалить с такого-то по такой
        srtBilLine.deleteCharAt(4); // удалить конктретный символ
        srtBilLine.insert(3, "Bye"); // добавляет в середину
        srtBilLine.reverse();
        String b = srtBilLine.toString();*/

        // разница в стринрг билдер и баффер, что стринг баффер используется в многопоточной.
        // методы баффер такие же
        // баффер самый медленный из них. билдер быстрый
        // сравнивать стрингбилдер и стринг нет смысла, разные классы. надо преобразовать к строке

        /*StringBuilder sbl = new StringBuilder("Coco Chanel");
        System.out.println(sbl.append("xxxx"));
        System.out.println(sbl.insert(5,"y"));
        System.out.println(sbl.delete(3,6));
        System.out.println(sbl.reverse());
        String s = sbl.toString();
        System.out.println(s);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line of numbers");
        String nums = scanner.nextLine();*/
        /*int n;

        int[] array = {0, 2, 4, 3};
        Arrays.sort(array); //0,2,3,4
        int[] newArray = new int[n+1];

        for (int i =0; i< array.length; i++){
            if (i != array[i]){
                System.out.println("Lost number is: " + i);
                break;
            }
            if (array[i]+1 == array.[i+1]){
                System.out.println();
            }
        }*/

        // for
        // i == array [i] -> continue;
        //sout(array[i]) break

        //sort
        //i==array[i] -> continue
        //sout(array[i])break


    }
}
