/*
Обобщенный класс с ограничениями типов
Описание:
Создайте обобщенный класс NumericPair, который хранит две числовые переменные и имеет метод для вычисления их суммы.
        Требования:
        •	Класс должен иметь конструктор для инициализации двух чисел.
        •	Метод double sum() возвращает сумму этих чисел.
Пример использования:
NumericPair<Integer> intPair = new NumericPair<>(10, 20);
System.out.println(intPair.sum()); // Вывод: 30.0

NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
System.out.println(doublePair.sum()); // Вывод: 10.0
package homework_26.task_03;
*/

import homework_26.task_03.NumericPair;

public class NumericPairApp {

    public static void main(String[] args) {

        homework_26.task_03.NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum());

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum());
    }
}
