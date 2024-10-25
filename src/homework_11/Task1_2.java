/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.

Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
*/

package homework_11;

import java.util.Arrays;

public class Task1_2 {
    public static void main(String[] args) {
        int[] array = new int[]{42, 58, 47, 93, 96, 56, 72, 82, 79, 71};


        // ---null / length = 0---
//        int[] array = null;
//        int[] array = new int [0];

        // Подсчитывает сумму всех элементов в массиве
        int sum = sumArr(array);
        System.out.println("Cумма всех элементов в массиве = " + sum);
        System.out.println(Arrays.toString(array));

        // Cреднее значение элементов в массиве (среднее арифметическое)
        double average = findAverage(array);
        System.out.printf("Cреднее значение элементов в массиве = %.2f%n", average);

    } // Methods area

    public static int sumArr(int[] array) {


        if (array == null || array.length == 0) {
            return 0;
        } else {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            return sum;
        }
    }

    public static double findAverage (int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        double average = (double) sumArr(array) / array.length; // переиспользуем метод вычисления суммы
        return average;
    }

} // End class
