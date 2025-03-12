package lesson_45;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
java.util.Date
java.util.Calendar
java.text.SimpleDateFormat

в Java 8
Joda-Time -> Java Time (java.time)
 */

public class JavaTime {

    public static void main(String[] args) {

        // LocalDate - представляет дату (год, месяц, день) без времени и часового пояса.
        LocalDate date =  LocalDate.now();
        System.out.println("now: " + date);

        LocalDate tomorrow = date.plusDays(1); // добавляет указанное количество дней к дате
        // todo - прослушать еще раз объяснения по tomorrow
        System.out.println("tomorrow: " + tomorrow);
        System.out.println("plusWeeks: " + date.plusWeeks(4)); // добавляет указанное количество недель к дате
        System.out.println("yesterday: " + date.minusDays(1)); // вычитает указанное количество дней из даты.

        LocalDate date1 = LocalDate.of(2002,2, 15); // установить дату (год, месяц, число)
        System.out.println("date1: " + date1);

        // Можно использовать ENUM с названием месяцев
        date1 = LocalDate.of(2003, Month.FEBRUARY, 15);
        System.out.println("date1: " + date1);

        System.out.println("год: " + date1.getYear() + "; месяц-enum: " + date1.getMonth() + "; месяц - число: " + date.getMonthValue());
        System.out.println("число: " + date1.getDayOfMonth() + "; день недели: " + date1.getDayOfWeek() + "; день года: " + date1.getDayOfYear());
        System.out.println("дней в мес: " + date1.lengthOfMonth() + "; дней в году" + date1.isLeapYear() + "; is leap: " + date1.isLeapYear());

        String dateString  = "2000-10-25"; // формат строки YYYY-MM-DD
        LocalDate date2 = LocalDate.parse(dateString);
        System.out.println("date2: " + date2);

        System.out.println("\n++++++++++++++++++++");

        // LocalTime - представляет время (часы, минуты, секунды и наносекунды) без даты и часового пояса.
        LocalTime time = LocalTime.now(); // возвращает текущее время.
        System.out.println("time" + time);

        time = LocalTime.of(21, 33);
        time = LocalTime.of(21,33,44);
        time = LocalTime.of(21,33,44, 546342);

        System.out.println( "time: " + time);

        System.out.println("time.plusHours(1): " + time.plusHours(1)); // - добавляют указанное количество часов
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65)); // - добавляют указанное количество минут
        System.out.println("time.minusSeconds(30)" + time.minusSeconds(30)); // вычитают указанное количество секунд

        System.out.println(time.getHour() + " | " + time.getMinute() + " | " + time.getSecond() + " | " + time.getNano());
        String timeStr = "12:33:45";
        // ожидает String в формате ISO-8601 ("2001-01-15T08:15:45+01:00")
        LocalTime time2 = LocalTime.parse(timeStr);
        System.out.println("time2: " + time2);

        System.out.println("\n+++++++LocalDateTime++++++++");
        // LocalDateTime - представляет дату и время без часового пояса.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);

        LocalDate localDate = LocalDate.of(2011, Month.APRIL, 15);
        LocalTime localTime = LocalTime.of(15,33,59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime: " + dateTime);
        dateTime = LocalDateTime.of(2025, 12, 31, 23, 59);
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfWeek().getValue());
        // Доступны все методы классов LocalDate + LocalTime
        System.out.println("dateTime.plusHours(1): " + dateTime.plusHours(1));
        System.out.println("dateTime.minusYears(1): " + dateTime.minusYears(1));

        String strDT = "2001-01-15T08:15:45";
        LocalDateTime parseDT = LocalDateTime.parse(strDT);
        System.out.println("parseDT: " + parseDT);

        System.out.println("\n++++++++ZonedDateTime+++++++++");
        // ZonedDateTime - представляет дату и время с часовым поясом.
        ZonedDateTime  zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: " + zonedDateTime);
        System.out.println("zonedDateTime.getZone(): " + zonedDateTime.getZone());

        System.out.println("\n++++++++isAfter, isBefore, until  и equals+++++++++");
        // isAfter, isBefore, until, equals есть у всех объектов представляющих дату и/или время
        // это методы, которые используются для сравнения и измерения времени в Java Time API.

        // Метод isAfter проверяет, что текущий объект даты/времени идет после указанного объекта.
        LocalDate date3 = LocalDate.of(2020,10,15);
        LocalDate date4 = LocalDate.of(2020,6,25);
        boolean isAfter = date3.isAfter(date4);
        System.out.println("date3.isAfter(date4): " + date3.isAfter(date4));

        // Метод isBefore проверяет, что текущий объект даты/времени идет до указанного объекта.
        System.out.println("date3.isBefore(date4): " + date3.isBefore(date4));

        // equals - проверяет даты / время на равенство
        System.out.println("date3.isEqual(date4): " + date3.isEqual(date4));
        System.out.println("date3.equals(date4): " + date3.equals(date4));

        // Метод until измеряет время между текущим объектом даты/времени и указанным объектом -> long
        // Результат измерения может быть представлен в различных единицах времени.
        long between = date3.until(date4, ChronoUnit.DAYS);
        System.out.println("between: " + between);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.now().minusDays(15);
        System.out.println(dateTime1.until(dateTime2, ChronoUnit.SECONDS));

        LocalDateTime dateTime3 = dateTime1.minus(10, ChronoUnit.DAYS);
        System.out.println("dateTime3: " + dateTime3);
        System.out.println(dateTime1.plus(5, ChronoUnit.YEARS));

        System.out.println("\n++++++++Duration, Period+++++++++");
        // Duration - представляет продолжительность в часах, минутах, секундах и наносекундах.
        // Чаще всего используется для измерения коротких промежутков времени
        // Period - представляет период времени в годах, месяцах и днях.

        LocalTime start = LocalTime.of(10,30);
        LocalTime end = LocalTime.of(12,45);
        // разница между временами
        Duration duration = Duration.between(start, end);
        System.out.println("duration: " + duration);
        long milis = duration.toMillis();
        System.out.println("milis: " + milis);
        long seconds = duration.toSeconds();
        System.out.println("seconds: " + seconds);
        System.out.println("duration.getSeconds(): " + duration.getSeconds());

        /*
        `toDays()`, `toHours()`, `toMinutes()`, `toMillis()`, `toNanos()`
        - возвращают продолжительность в соответствующих единицах измерения.
         */

        System.out.println("\n++++++++Instant+++++++++");
        // Instant — это класс в Java, который представляет момент времени в
        // эпохе Unix (количество времени в миллисекундах с начала
        // эпохи Unix: 1 января 1970 года, 00:00:00 UTC). Представляет собой точку на временной шкале в Григорианском календаре
        // Класс Instant является частью пакета java.time и предоставляет методы для работы
        // с временем в формате Unix timestamp.

        Instant instant = Instant.now();
        System.out.println("instant: " + instant.getEpochSecond());

        System.out.println("\n+++++++++++DateTimeFormatter ++++++++++");
        // Для форматирования и парсинга дат используется класс DateTimeFormatter.
        // Он позволяет создавать форматированные строки из дат и времени,
        // а также обратно парсить строки в объекты дат и времени.
        // Парсинг - Анализ (разбор) строки, содержащей дату или время

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now: " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-M-yyyy HH:mm:ss a");
        String formattedDate = now.format(formatter);
        System.out.println("formattedDate: " + formattedDate);

        /*
        В шаблоне используются следующие символы:
        y - год.
        M - месяц.
        d - день.
        H - час в формате от 0 до 23.
        h - час в формате от 0 до 12.
        m - минута.
        s - секунда.
        Остальные симполы в шаблоне отображается "как есть".

        Количество повторений символа определяет формат отображения unit:
        "yy" - двухзначный год, например "25" для "2025" года.
        "yyyy" - четырехзначный год, например "2025".
        "M" - однозначный или двухзначный месяц, например "2" или "12".
        "MM" - двухзначный месяц, например "02" или "12".
        "d" - однозначный или двухзначный день, например "3" или "25".
        "dd" - двухзначный день, например "03" или "25".
        "a" - pm/ am
         */

        String dateForParce = "2023-10-26 19:15";
        System.out.println("stringWithDate: " + dateForParce);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime parseLDT = LocalDateTime.parse(dateForParce, formatter1);
        System.out.println("parseLDT: " + parseLDT.getDayOfWeek() + " | " + parseLDT.getHour());

        /*
        ----Optional HW----
        15-12-2022 20-46
        Запарсить в cтроку формата LDT
        Распечатать отдельно месяц, день, час объекта LDT

        13-01-2023 00-47
        Какому дню недели соответствует вторая дата
        Ск дней между этими двумя датами
         */





    }
}
