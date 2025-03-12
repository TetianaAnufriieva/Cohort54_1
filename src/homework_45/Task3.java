/*
----Optional HW----
15-12-2022 20-46
Запарсить в cтроку формата LDT
Распечатать отдельно месяц, день, час объекта LDT

13-01-2023 00-47
Какому дню недели соответствует вторая дата
Ск дней между этими двумя датами
 */
package homework_45;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task3 {

    public static void main(String[] args) {

        String dateForParce1 = "15-12-2022 20-46";
        System.out.println("dateForParce: " + dateForParce1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateForParce1, formatter);
        System.out.println("dateTime: " + dateTime);
        System.out.println("dateTime.getMonth(): " + dateTime.getMonth());
        System.out.println("dateTime.getDayOfMonth(): " + dateTime.getDayOfMonth());
        System.out.println("dateTime.getHour(): " + dateTime.getHour());

        System.out.println("\n**********************");

        String dateForParce2 = "13-01-2023 00-47";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime dateTime1 = LocalDateTime.parse(dateForParce2,formatter1);
        System.out.println("dateTime1.getDayOfWeek(): " + dateTime1.getDayOfWeek());

        System.out.println("Между двумя датами: " + ChronoUnit.DAYS.between(dateTime,dateTime1) + " дней.");

    }
}
