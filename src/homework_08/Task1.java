/*
Task 1
Найдите произведение всех чисел от 1 до 10 включительно.
Результат выведите на экран
 */

package homework_08;

public class Task1 {
    public static void main(String[] args) {
        int i = 1;
        int multi = 1;

        while (i <= 10) {
            multi = multi*i;
            i++;
        }
        System.out.println("Произведение всех чисел от 1 до 10 включительно = " + multi);
    }
}
