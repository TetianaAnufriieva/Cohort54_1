/*

Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.

 */

package homework_05;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scanner.nextLine();
        System.out.println(name.length());

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        System.out.println("firstChar = " + firstChar);
        System.out.println("lastAChar = " + lastChar);

        int decCodeFirst = (int) firstChar;
        int decCodeLast = (int) lastChar;
        System.out.println("decCodeFirst = " + decCodeFirst);
        System.out.println("decCodeLast = " + decCodeLast);

    }
}