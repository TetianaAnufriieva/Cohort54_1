package homework_08;

import java.util.Scanner;

public class Task5Teacher {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольное число");
        long input = scanner.nextLong();
        scanner.nextLine();

        if (input < 0 ) {
            input = input * -1;
        }
        // Копирую значения для обработки во втором варианте решения
        long num2 = input;


        int sum = 0;

        while (input > 0) {
            // код откусывание цифры
            long currentDigit = input % 10;

            sum += currentDigit;

            System.out.print(currentDigit + " + ");

            input = input / 10;
        }

        System.out.println(" = " + sum);

        System.out.println("\n=============== Option2 ========");
        String numStr = "" + num2; // Простой способ преобразовать число в String
        // numStr = String.valueOf(num2); // Еще один способ преобразовать число в String

        int len = numStr.length();

        int sum2 = 0;

        while (len > 0 ){
            int pow = (int) Math.pow(10, len - 1); // 10 в степени (длина - 1)
            long digit = num2 / pow; // получаем самую левую цифру
            sum2 += digit;

            System.out.print(digit + " + ");
            num2 = num2 % pow; // отрезаем уже полученную цифру
            len--;

        }
        System.out.println(" = " + sum2);

    }
}
