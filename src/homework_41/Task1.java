/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям:
четные, больше 10 и меньше 100
Для фильтрации используйте Stream API
 */
package homework_41;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(-20, -15, 0, 5, 12, 48, 102, 99, 8, 76, 150, 34, 88, 11, 100, -8, -50);
        List<Integer> integerList = integers.stream()
                .filter(val -> (val > 10) && (val < 100) && (val % 2 == 0))
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
