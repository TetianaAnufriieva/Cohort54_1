/*
Task 2
Неизменяемая переменная
•	Объявите переменную final int MAX_USERS = 100;.
•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
•	Объясните, что произошло при попытке изменения значения.
 */

package homework_19;

import homework_18.calculator.Calculator;

public class CalculatorApp {
    public static void main(String[] args) {

        final int MAX_USERS = 100; // Task 2. Изначальное значение переменной

        System.out.println("Сложение: " + homework_18.calculator.Calculator.additon(2,5));
        System.out.println("Деление: " + homework_18.calculator.Calculator.division(5.5, 8));
        System.out.println("Вычитание: " + homework_18.calculator.Calculator.substraction(15, 85.6));
        System.out.println("Умножение: " + Calculator.multiplikation(6.7, 8.7));

        System.out.println("Длина окружности: " + homework_19.Calculator.сircumference(6.3));
        System.out.println("Площадь круга: " + homework_19.Calculator.circleArea(6.3));

        System.out.println("***********");
        // При попытке изменения значения компилятор выдает ошибку, потому что это переменнвя с модификатором
        // final и её значение можно присвоить только 1 раз (как я сделала выше MAX_USERS = 100).
        // Изменить не получится.
        //MAX_USERS = 110;
        System.out.println("MAX_USERS = " + MAX_USERS);
        System.out.println("***********");

    }
}
