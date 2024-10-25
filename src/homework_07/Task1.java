/*
Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор:
1, 2 или 3.
Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
 */


package homework_07;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на выбор:\n" +
                "1, 2 или 3.");
        int value = scanner.nextInt();
        scanner.nextLine();

        if (value == 1) {
            System.out.println("Пользователь ввёл: один");
        } else if (value == 2) {
            System.out.println("Пользователь ввёл: два");
        } else if (value == 3) {
            System.out.println("Пользователь ввёл: три");
        } else {
            System.out.println("Пользователь ввёл неверное число");
        }

    }
}
