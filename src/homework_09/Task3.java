/*
Task 3 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100.
Программа должна найти, и вывести на экран все простые числа.
Посчитайте сколько получилось таких чисел в массиве.
Простое число - число, которое делится на цело только на 1 и само себя.
Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */

package homework_09;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 0;
        int count = 0;
        int[] array = new int[50];
        array[i] = random.nextInt(101);

            System.out.print("[");
            while (i < array.length) {
                array[i] = random.nextInt(101);
                    if (array[i] % 2 != 0) {
                        System.out.print(array[i] + (i < array.length - 1 ? ", " : "]\n"));

                        count++;
                    }
                i++;
            }
            System.out.println( "Простых чисел = " +count);

    }
}


