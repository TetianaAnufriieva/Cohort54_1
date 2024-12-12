/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists, который принимает два параметра типа MyArrayList и MyArrayList, и выводит элементы обоих списков.
Требования:
Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.
Пример использования:
MyArrayList<String> names = new MyArrayList<>();
names.add("Alice");
names.add("Bob");
MyArrayList<Integer> scores = new MyArrayList<>();
scores.add(85);
scores.add(92);
printTwoLists(names, scores);
// Вывод: // Alice // Bob // 85 // 92
 */
package homework_26.task_02;

import lists.MyArrayList;

public class ListPrinterApp {

    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        ListPrinter.printTwoLists(names, scores);
    }
}
