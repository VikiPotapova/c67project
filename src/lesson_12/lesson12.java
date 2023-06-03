package lesson_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lesson12 {
    public static void main(String[] args) {
        String testLine = "Hello from group 67";

        // String pattern = "[A-z]{3}"; // что ищем сколько ищем (регистр влияет).подряд буквы-сколько указана цифра.[A-Za-z]
        //  String pattern = "\\s+";

        //  System.out.println(testLine.replaceAll(pattern," "));
        // регуляция частоты. правая часть
        // {2,5} от 2 до 5. то есть вместо дефиса -,
        // {2,} от двух и более.
        // ? - 1 раз или отсутсвует без скобок. можно вмесо цифр
        // - можно вместе с вопросом, тогда минут будет искать -?[1-9]{2}/ может быть минус (мб и не быть)+ 2 цифры
        // * - сколько угодно раз. от 0 и выше.
        // + - один и более раз встретиться

        // левая часть!
        // буквы. через тире, запятую.
        // есть сокращенные формы:
        // \\d - цифры
        // \\D- все кроме цифр
        // \\s -ищет пробелы s+ значит от двух и более.
        // \\w -буквы цифры и симфолы как нижнее подчеркивание.
        // . - все сколько угодно раз
        // ^ в начале строки. $ в конце строки с конца
        // если вместе то только конктретноого размера строка ^[a-z]{3}$/ начти в начале строки 3 буквы (слово из 3-х)
        // \\ u12334 поиск по юникоду

        // \n перейти на новую строку
        // \t табуляция ( 3-4 пробела )
        // есть 2 класса, кот-е  раб-т с реджексами. Паттерн и Матчер. нужны для поиска и вывода. в отличии от реплейс
        /*Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(testLine);
        while (matcher.find()){ // return boolean if found smth
            System.out.println(matcher.start()); // index 1st
            System.out.println(matcher.end()); // index the last
            System.out.println(matcher.group()); // return the value of what we are looking for
        }*/

       /* String str = "Hello world";
        System.out.println(str.replaceAll("[A-z]{1}", "&"));*/

        /*String s = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        Pattern pattern1 = Pattern.compile("//d+");
        Matcher matcher1 = pattern1.matcher(s);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        Pattern pattern2 = Pattern.compile("@[a-z]+");
        Matcher matcher2 = pattern2.matcher(s);
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
        String s3 = "null";
        Pattern pattern3 = Pattern.compile("^null$");
        Matcher matcher3 = pattern3.matcher(s3);
        System.out.println(matcher3.find());

        String s5 = "Hello \n World \n !!!";
        Pattern pattern5 = Pattern.compile("\\n+");
        Matcher matcher5 = pattern5.matcher(s5);
        String result = matcher5.replaceAll("");
        System.out.println(result);*/

    String s6 ="Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
        Pattern pattern6 = Pattern.compile("[А-Я]{1}[а-я]+ [А-Я]{1}[а-я]+");
        Matcher matcher6 = pattern6.matcher(s6);
        while (matcher6.find())
        System.out.println(matcher6.group());
    }
}