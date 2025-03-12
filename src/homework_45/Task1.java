/*
*Получить и вывести на экран:
-текущую дату
-текущий год, месяц и день
*Создать дату, например Ваш день рождения и вывести на экран
*Создать две даты и проверить на равенство
*Получить и вывести на экран:
-текущее время
-текущее время + 3 часа
*Создать дату:
-которая на неделю позже сегодняшней
-которая была на год раньше сегодняшней используя метод minus
-которая на год позже сегодняшней
-tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */
package homework_45;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Task1 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);

        LocalDate birthDate = LocalDate.of(1988, 03, 29);
        System.out.println("birthDate: " + birthDate);

        LocalDate date1 = LocalDate.of(2024, 03,12);
        LocalDate date2 = LocalDate.of(2025, Month.MARCH,12);
        System.out.println("date1.isEqual(date2): " + date1.isEqual(date2));
        System.out.println("date1.equals(date2): " + date1.equals(date2));

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime: " + localTime);

        System.out.println("localTime.plusHours(3): " + localTime.plusHours(3));
        System.out.println("localDate.plusWeeks(1): " + localDate.plusWeeks(1));
        System.out.println("localDate.minusYears(1)" + localDate.minusYears(1));
        System.out.println("localDate.plusYears(1)" + localDate.plusYears(1));

        LocalDate yesterday = localDate.minusDays(1);
        System.out.println("yesterday: " + yesterday);
        System.out.println(yesterday.isBefore(localDate));

        LocalDate tomorrow = localDate.plusDays(1);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println(tomorrow.isAfter(localDate));

    }
}
