/*
Task 5 * (Опционально)
Программа запрашивает у пользователя ввод произвольного числа.
Вывести сумму цифр этого числа.
Пример:
567432 -> 5+6+7+4+3+2 -> 27
*/


package homework_08;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольное число\n");
        int number = scanner.nextInt();
        scanner.nextLine();

        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.printf("Сумма его чисел %d", sum);
    }
}
