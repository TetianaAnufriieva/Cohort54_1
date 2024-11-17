/*
Task 1
Дополните Класс "Калькулятор" из предыдущего домашнего задания
Класс Calculator, который будет предоставлять
- базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
- Вычисление длины окружности и площади круга по ее радиусу

Класс должен содержать:
- Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции (сделано в прошлом ДЗ)
- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
- Константу (число Пи)
 */

package homework_19;

public class Calculator {

    public static final double PI = 3.14;

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

    public static double сircumference(double radius){
    return (2 * PI * radius);
    }

    public static double circleArea(double radius){
    return (PI * radius * radius);
    }
}
