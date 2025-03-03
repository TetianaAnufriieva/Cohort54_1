/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе
и выведите результат на экране
 */
package homework_42;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(5, 4, 14, 56, 32, 25, -1, -10, 0, 10);

        List<Integer> result = integers.stream()
                .filter(n -> n > 10)
                .sorted((x, y) -> Integer.compare(x % 10, y % 10))
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
