/*

Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".

 */


package homework_05;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку чётной длины с клавиатуры");
        String Str = scanner.nextLine();

        int middleStr = Str.length()/2;
        char symbol1 = Str.charAt(middleStr-1);
        char symbol2 = Str.charAt(middleStr);
        System.out.printf("%c%c", symbol1, symbol2);

    }

}
