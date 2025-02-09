/*
Task 2
Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:
Четные целые числа должны идти перед нечетными числами
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Output
 */
package homework_36.Task2;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator {
    public static void main(String[] args) {

        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer intNum1, Integer intNum2) {

                if ((intNum1 % 2 == 0) && (intNum2 % 2 != 0)){
                    return -1;
                } else if ((intNum1 % 2 != 0) && (intNum2 % 2 == 0)){
                    return 1;
                }
                else {
                    return intNum1 - intNum2;
                }
            }
        });
        System.out.println(Arrays.toString(integers));
    }
}
