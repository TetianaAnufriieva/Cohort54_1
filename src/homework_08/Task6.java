/*
Task 6
Создать массив целых чисел произвольной длины от 5 до 15.
Заполнить массив случайными значениями от -50 до 50.
Вывести на экран:
Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */

package homework_08;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        Random random = new Random();
        int length = random.nextInt(11)+5; //5...15 -> ((max - min) + 1) + min
        int[] array = new int[length];

        int min = array[0];
        int max = array[0];
        int i = 0;
        int sum = 0;
        double average;


        System.out.print("[");
        while (i < array.length) {
            array[i] = random.nextInt(101) - 50; //-50...50 -> ((max - min) + 1) + min
            System.out.print(array[i] + ((i < array.length -1) ? ", " : "]\n"));

//            if (i < array.length -1) {
//                System.out.print(", ");
//            } else {
//                System.out.print("]");
//            }

            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }

            sum = sum + array[i];

            i++;

        }

        average = (double) sum / array.length;

        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.printf("Среднее арифметическое всех значений в массиве: %.2f", average);

    }
}
