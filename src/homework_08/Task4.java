/*
Task 4 *(Опционально)
Напишите программу, которая просит пользователя ввести слово "hello".
Если пользователь вводит правильное слово, программа благодарит его и завершает работу.
Если вводится неправильное слово, программа продолжает запрашивать ввод,
пока не будет введено правильное слово.
 */


package homework_08;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = " ";
        String originalStr = "hello";

        while (! str.equals(originalStr)) {
            System.out.println("Введите слово \"hello\".");
            str = scanner.nextLine();

            if (! str.equals(originalStr)) {
                System.out.println("Вы ввели неверное слово");
            }
        }
        System.out.println("Вы ввели правильное слово");

    }
}
