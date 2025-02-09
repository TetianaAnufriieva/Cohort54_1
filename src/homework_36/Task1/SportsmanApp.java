/*
Task 1
Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг).
Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name.
Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому критерию, например, по score.
В методе main создайте массив из нескольких объектов Sportsman.
Отсортируйте его с использованием:
естественного порядка, определенного в Comparable,
данного класса Comparator,
анонимного класса Comparator для сортировки по третьему полю (например, age).
Выведите каждый вариант отсортированного массива в консоль.
 */
package homework_36.Task1;

import homework_36.Task1.Sportsman;
import homework_36.Task1.SportsmanScoreComparator;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {

    public static void main(String[] args) {

        Sportsman[] sportsmen = new Sportsman[5];
        sportsmen[0] = new Sportsman("Kate", 20, 7 );
        sportsmen[1] = new Sportsman("Petr", 19, 5 );
        sportsmen[2] = new Sportsman("Olga", 22, 6 );
        sportsmen[3] = new Sportsman("Igor", 30, 8 );
        sportsmen[4] = new Sportsman("Kate", 22, 5 );

        // Сортировке с использованием естественного порядка, определенного в Comparable
        System.out.println(Arrays.toString(sportsmen));
        Arrays.sort(sportsmen);
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("***************************\n");
        // Сортировке с использованием класса Comparator
        SportsmanScoreComparator sportsmanScoreCorporator = new SportsmanScoreComparator();
        Arrays.sort(sportsmen, sportsmanScoreCorporator);
        System.out.println(Arrays.toString(sportsmen));


        System.out.println("***************************\n");
        // Сортировке с использованием анонимного класса Comparator для сортировки по третьему полю (например, age).
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return s1.getAge() - s2.getAge();
            }
        });

        System.out.println(Arrays.toString(sportsmen));
    }
}
