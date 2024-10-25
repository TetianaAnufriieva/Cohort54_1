/*
Task 7
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
Пример:
{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
 */
package homework_08;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[]{ 5, 6, -25, 0, 31, -15 };
        int i = 0;
        int maxIndex = 0;
        int minIndex = 0;
        int value;

        while (i < array.length) {
            if (array[maxIndex] < array[i]) maxIndex = i;
            if (array[minIndex] > array[i]) minIndex = i;

            i++;
        }
        System.out.println("Изначальный массив " + Arrays.toString(array));
        System.out.println("minIndex = " + minIndex);
        System.out.println("maxIndex = " + maxIndex);

        value = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = value;

        System.out.println("Массив, где поменяли местами элементы с максимальным и минимальным значениями " + Arrays.toString(array));

    }
}
