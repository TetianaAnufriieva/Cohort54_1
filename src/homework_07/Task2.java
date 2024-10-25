/*
Task 2
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
 */


package homework_07;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int value1 = random.nextInt(101);
        int value2 = random.nextInt(101);
        int value3 = random.nextInt(101);
        int value4 = random.nextInt(101);
        System.out.println(value1 + "|" + value2 + "|" + value3 + "|" + value4 + "\n");

        int max = value1;
        if (value2 > max) {
            max = value2;
        }
        if (value3 > max) {
            max = value3;
        }
        if (value4 > max) {
            max = value4;
        }
        System.out.println("Максимальное число: " + max);

    }
}
