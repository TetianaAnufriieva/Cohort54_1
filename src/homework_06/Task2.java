/*
Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:
равны ли переменные,
не равны ли они,
больше ли a, чем b,
и меньше ли b, чем a.
Выведите результат на экран.
 */

package homework_06;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {


        // Генерация случайного числа (псевдослучайного числа)
        Random random = new Random();

        int a = random.nextInt(51); // (0...51-1) -> (0..50) включительно
        System.out.println("Случайное число a = " + a);

        int b1 = random.nextInt(101); // (0...101-1) -> (0..100) включительно
        System.out.println("Случайное число b1 = " + b1);

        // Генерация случайного числа в диапазоне -20...30 -> ((max - min) + 1) + min
        int b2 = random.nextInt(51) - 20;
        System.out.println("Случайное число b2 = " + b2);

        // Проверяем равны ли переменные
        boolean val1 = (a == b1);
        System.out.println(a + " == " + b1 + " -> " + val1);

        boolean val2 = (a == b2);
        System.out.println(a + " == " + b2 + " -> " + val2);

        // Проверяем не равны ли переменные
        val1 = (a != b1);
        System.out.println(a + " != " + b1 + " -> " + val1);

        val2 = (a != b2);
        System.out.println(a + " != " + b2 + " -> " + val2);

        // Проверяем больше ли a, чем b
        val1 = (a > b1);
        System.out.println(a + " > " + b1 + " -> " + val1);

        val2 = (a > b2);
        System.out.println(a + " > " + b2 + " -> " + val2);

        // Проверяем меньше ли a, чем b
        val1 = (a < b1);
        System.out.println(a + " < " + b1 + " -> " + val1);

        val2 = (a < b2);
        System.out.println(a + " < " + b2 + " -> " + val2);
    }
}