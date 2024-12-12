/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.
Требования:
Класс должен иметь конструктор, принимающий два параметра типа T.
Методы:
T getFirst() — возвращает первый элемент.
T getSecond() — возвращает второй элемент.
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.
Пример использования:
Pair<String> pair = new Pair<>("Hello", "World");
System.out.println(pair.getFirst()); // Вывод: Hello
System.out.println(pair.getSecond()); // Вывод: World
pair.swap();
System.out.println(pair.getFirst()); // Вывод: World
System.out.println(pair.getSecond()); // Вывод: Hello
*/

package homework_26.task_01;

import lists.MyArrayList;

public class PairApp {

    public static void main(String[] args) {

        homework_26.task_01.Pair<String> pair = new Pair<String>("Hello", "World");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.swap();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }
}
