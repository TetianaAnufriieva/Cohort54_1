/*
Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */


package homework_06;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число с клавиатуры: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        boolean value1 = (number % 2 == 0);
        boolean value2 = (number % 3 == 0);
        boolean value3 = value1 && value2;

        System.out.println("Число: " + number + " чётное: " + value1 + "; кратно 3: " + value2 + "; четное и кратное 3: " + value3);

    }
}
