package Lesson_17;


import java.time.LocalDate;

public class ZadachiDate {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1700, 6, 15);
        System.out.println(date1.getDayOfWeek());

        //найти дату следующего вторника
        LocalDate dateNow = LocalDate.now();
        int dayOfWeek = dateNow.getDayOfWeek().getValue();
        //int plusDays = 7 -dayOfWeek + 2;
        System.out.println(dateNow.plusDays(7-dayOfWeek+2));

        // 2-й вариант
       /* LocalDate date = LocalDate.now();
        do {
            date = date.plusDays(1);
        } while (!date.getDayOfWeek().equals(DayOfWeek.TUESDAY));
        System.out.println(date);*/



    }
}
