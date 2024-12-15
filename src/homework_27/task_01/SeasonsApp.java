/*
Task 1
Реализуйте Enum для определения четырех времен года с методами, возвращающими среднюю температуру
для каждого времени года.
*/
package homework_27.task_01;

public class SeasonsApp {

    public static void main(String[] args) {

        for(WeatherSeason seasons : WeatherSeason.values()) {
            System.out.println(seasons.toString());
            System.out.println(seasons.getAverageTemp());
            System.out.println("*****************\n");
        }
    }
}
