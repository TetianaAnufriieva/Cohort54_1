/*
Task 3
Используйте цикл while для решения задачи:
Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
 */


package homework_08;

public class Task3 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 100){
            if (i % 5 == 0) {
                System.out.print(i + " | ");
            }
            i++;
        }
    }
}
