/*
Task3
Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:
Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Output
 */
package homework_36.Task3;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator2 {
    public static void main(String[] args) {

        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer intNum1, Integer intNum2) {
                if ((intNum1 % 2 != 0) && (intNum2 % 2 == 0)){
                    return 1;
                } else if ((intNum1 % 2 == 0) && (intNum2 % 2 != 0)){
                    return -1;
                } else if ((intNum1 % 2 == 0) && (intNum2 % 2 == 0)){
                    return intNum1 - intNum2;
                } else if ((intNum1 % 2 != 0) && (intNum2 % 2 != 0)){
                    return intNum2 - intNum1;
                }
                return 0;
            }
        });
        System.out.println(Arrays.toString(integers));
    }
}
