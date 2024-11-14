/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять
базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:
Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
 */

package homework_18.calculator;

public class Calculator {

    public static double additon(double x, double y){
        return x + y;
    }

    public static double substraction(double x, double y){
        return x - y;
    }

    public static double multiplikation(double x, double y){
        return x * y;
    }

    public static double division(double x, double y){
        if (y != 0) {
            return x / y;
        } else {
            return Integer.MIN_VALUE;
        }

    }
}
