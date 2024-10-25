package homework_07;

import java.util.Scanner;

public class Task3Teacher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четырехзначное число");
        String digitStr = scanner.nextLine();

        // Option 1
        if (digitStr.length() != 4) {
            // Строка состоит не из 4 символов
            System.out.println("выводится сообщение об ошибке");
        } else {

//            System.out.println(digitStr + 1000);
            // Строка из 4-ч символов. Код обработки этой строки
            // 0...9 -> 48 - 57;

//            int char1 = digitStr.charAt(0) - 48;
//            int char2 = digitStr.charAt(1) - 48;
//            int char3 = digitStr.charAt(2) - 48;
//            int char4 = digitStr.charAt(3) - 48;

            // Проверка, что символ является цифрой
            if (digitStr.charAt(0) < 48 || digitStr.charAt(0) > 57) {
                System.out.println("Введено не число");
            }


            if (digitStr.charAt(0) + digitStr.charAt(1) == digitStr.charAt(2)  + digitStr.charAt(3)) {
                System.out.println("Счастливый билет!");
            } else {
                System.out.println("Билет не счастливый");
            }
        }

        //Option 2
        if (digitStr.length() == 4) {
            // Код обработки строки
            // Строка кода может вызвать аварийное завершение программы при некорректном вводе
            int input = Integer.parseInt(digitStr);
//            System.out.println(input + 1000);

            // 1234 / 10 -> 123; % 10 -> 4
            int digit0 = input % 10;
            input = input / 10;

            // 123
            int digit1 = input % 10;
            input = input / 10;

            // 12
            int digit2 = input % 10;
            int digit3 = input / 10;

            System.out.printf("Цифры %d, %d, %d, %d\n", digit0, digit1, digit2, digit3);

            if (digit0 + digit1 == digit2 + digit3) {
                System.out.println("Вариант 2. Число счастливое!");
            } else {
                System.out.println("Вар2. Не счастливое");
            }

        }
        else {
            System.out.println("Вы ввели не 4-значное число");
        }


    }
}
