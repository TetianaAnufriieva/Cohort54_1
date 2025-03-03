/*
Task 3
Имеется список целых чисел.
Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число умножить на 2,
и собрать результат в новый список
 */
package homework_42;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(5, 4, 14, 56, 32, 25, -1, -10, 0, 10);

        List<Integer> result = integers.stream()
                .filter( integer -> integer % 2 == 0)
                .map(integer -> integer * 2)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
