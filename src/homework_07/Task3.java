/*
Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */


package homework_07;

import javax.swing.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: \n");
        String number = scanner.nextLine();

        if ((number.length() == 4) && (number.matches("\\d{4}"))) {
           System.out.println("Вы ввели правильное четырехзначное число: " + number);

            // Значение ASCII цифр [0 – 9] находится в диапазоне [48 – 57]
/*
            int val1 = (int)(number.charAt(0) - 48);
            int val2 = (int)(number.charAt(1) - 48);
            int val3 = (int)(number.charAt(2) - 48);
            int val4 = (int)(number.charAt(3) - 48);
*/
            int val1 = (int)(number.charAt(0));
            int val2 = (int)(number.charAt(1));
            int val3 = (int)(number.charAt(2));
            int val4 = (int)(number.charAt(3));

            int firstSum =  val1 + val2;
            int secondSum = val3 + val4;

            if (firstSum == secondSum) {
                System.out.println("Число " +  number + " -> " + val1 + " + " +
                        val2 + " = " + firstSum + "; " + val3 + " + " +
                        val4 + " = " + secondSum + "; " +  firstSum + " равно " + secondSum +
                " - число счастливое.\n");
            } else System.out.println("Число " +  number + " -> " + val1 + " + " +
                    val2 + " = " + firstSum + "; " + val3 + " + " +
                    val4 + " = " + secondSum + "; " +  firstSum + " не равно " + secondSum +
                    " - число НЕ является счастливым.\n");

        } else System.out.println("Error: введенное значение не является четырехзначным числом");

        // Method 2 c использованием valueOf и с переменной типа int
        System.out.println("Введите четырехзначное число: \n");
        String number1 = scanner.nextLine();
        Integer numberInt = Integer.valueOf(number1);
        System.out.println("Число преобразовано из строки в int: " + numberInt);
        if (number.length() == 4) {
            System.out.println("Вы ввели правильное четырехзначное число: " + number);

            int val1Int = numberInt / 1000; // (1450 / 1000 = 1)
            int val2Int = (numberInt / 100) % 10; // (1450 / 100 = 14 % 10 = 4)
            int val3Int = (numberInt / 10) % 10; // (1450 / 10 = 145 % 10 = 5)
            int val4Int =  numberInt % 10 ; // (1450 % 10 = 0)

            int firstSum1 =  val1Int + val2Int;
            int secondSum1 = val3Int + val4Int;

            if (firstSum1 == secondSum1) {
                System.out.println("Число " +  number + " -> " + val1Int + " + " +
                        val2Int + " = " + firstSum1 + "; " + val3Int + " + " +
                        val4Int + " = " + secondSum1 + "; " +  firstSum1 + " равно " + secondSum1 +
                        " - число счастливое.\n");
            } else System.out.println("Число " +  number + " -> " + val1Int + " + " +
                    val2Int + " = " + firstSum1 + "; " + val3Int + " + " +
                    val4Int + " = " + secondSum1 + "; " +  firstSum1 + " не равно " + secondSum1 +
                    " - число НЕ является счастливым.\n");

        } else System.out.println("Error: введенное значение не является четырехзначным числом");


    }

}
