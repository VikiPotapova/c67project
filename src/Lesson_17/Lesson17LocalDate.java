package Lesson_17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Lesson17LocalDate {
    public static void main(String[] args) {
       /* LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date1 = LocalDate.of(1890,6,15);
        LocalDate date2 = LocalDate.parse("2023-01-01");
        date2 = date2.plusDays(10);
        date2 = date2.plusYears(1);
        date2 = date2.minus(1, ChronoUnit.DECADES);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());

        System.out.println(date.isLeapYear()); // високосный год

        System.out.println(date2.isBefore(LocalDate.now()));
        System.out.println(date1.isAfter(LocalDate.now()));

        // если хотим задавать время то LocalTime
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime timeNday = LocalDateTime.now();*/
        LocalDate d =LocalDate.now();
        System.out.println(d);
        System.out.println(d.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));


    }
}
