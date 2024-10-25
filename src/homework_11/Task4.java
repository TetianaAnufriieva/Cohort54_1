/*
Task 4 * (Опционально)
Написать метод, который удаляет все вхождения заданного числа из массива и
возвращает новый массив без этого числа.
 */
package homework_11;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[]{45, 34, 5, -3, 34, 45 , 8, 9, 7, -8, 45, 1, 36};
        int number = 45;
        int[] result = removeValueFromArray (array, number);
        System.out.println(Arrays.toString(result));

    } // Methods area

        /*
        1. Посчитать кол-во вхождений без заданного числа в массиве -> count
        2. Создать массив нужной длины 
        3. Записать в массив все числа != заданному числу
        4. Вернуть из метода обновленный массив (без указанного числа)
        */

    public static int[] removeValueFromArray (int[] arr, int value){
        // Считаем кол-во вхождений без заданного числа в массиве
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] != value) {
                count++;
            }
        }

        // Если заданное число не найдено -> возвращаeм исходный массив
        if (count == arr.length) return arr;


        // Создадим массив, в котором будут хранится все числа кроме заданного
        int[] result = new int[count];

        // Заполняем наш массив
        for (int i = 0, idxNewArr = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                result[idxNewArr] = arr[i];
                idxNewArr++;
            }
        }
        return result;

    }

} // End class
