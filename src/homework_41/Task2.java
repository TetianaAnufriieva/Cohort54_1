/*
Task 2
Дан список строк.
Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.
Результат сохраните в новый список строк.
 */
package homework_41;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        List<String> strings = List.of( "Orange", "Apple", "Avocado", "Mango", "Apricot",
                "Banana", "Almond", "Cherry", "Blueberry");
        List<String> stringList = strings.stream()
                .filter(str -> str.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}
