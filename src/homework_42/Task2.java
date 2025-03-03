/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */
package homework_42;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Task2 {

    public static void main(String[] args) {

        List<String> strings = List.of("apple", "banana", "abc", "Abc", "kiwi", "   ", "cherry", "fig", "grape");
//        List<String> strings = List.of();

        Optional<String> shortestStrOptional = strings.stream()
                .min(Comparator.comparingInt(String::length));

        if (shortestStrOptional.isPresent()) {
            System.out.println("Самая короткая строка: " + shortestStrOptional.get());
        } else {
            System.out.println("Список строк пуст");
        }
    }
}
