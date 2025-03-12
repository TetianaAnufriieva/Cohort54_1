/*
Написать метод, принимающий список из нескольких дат типа LocalDate
и возвращающий количество дней между самой ранней и поздней датами в этом списке
 */
package homework_45;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task2 {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2022,9,30);
        LocalDate date3 = LocalDate.of(1999,5,30);

        List <LocalDate> dateList = new ArrayList<>(List.of(date1,date2,date3));
        System.out.println("Количество дней между самой ранней и поздней датами: " + daysBetweenMinMax(dateList));

    }
    public static long daysBetweenMinMax(List<LocalDate> dates){
        if (dates == null || dates.isEmpty()){
            throw new IllegalArgumentException("Список дат не должен быть пустым");
        } else {
            LocalDate min = dates.stream().filter(Objects::nonNull).min(LocalDate::compareTo).orElseThrow();
            LocalDate max = dates.stream().filter(Objects::nonNull).max(LocalDate::compareTo).orElseThrow();

            return ChronoUnit.DAYS.between(min,max);
        }

    }

}
