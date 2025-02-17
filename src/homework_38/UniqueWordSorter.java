/*
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке
 */
package homework_38;

import java.util.*;

public class UniqueWordSorter {

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    private static List<String> getUniqueSortedWords(String testString) {
        // Заменяем все НЕбуквы на пустоту
        String newStr = testString.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        System.out.println(newStr);

        // Преобразования строки в массив слов
        String[] words = newStr.split(" ");
        System.out.println(Arrays.toString(words));

        Set<String> sortedSet = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

        sortedSet.addAll(List.of(words));

        return new ArrayList<>(sortedSet);
    }

}
