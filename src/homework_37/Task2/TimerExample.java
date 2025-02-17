/*
Task 2
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

Создайте 4 метода, принимающий реализацию интерфейса List.
В первом методе - получение всех значений элементов списка по его индексу
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Четвертый метод -удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.

И сравните время последовательного выполнения всех методов для каждой реализации List-а.
 */
package homework_37.Task2;

import java.util.*;

public class TimerExample {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 5000; i++) {
            int value = random.nextInt(1001);// Генерация случайного числа в диапазоне 0...1000 -> ((max - min) + 1) + min
            list1.add(value);
            list2.add(value);
        }
        // Проверка размеров списков
        System.out.println("list1 size: " + list1.size());
        System.out.println("list2 size: " + list2.size());

        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);

        // Получение значений элементов списка по его индексу

        int retrievedElement1 = getElementByIndex(list1, 0);
        int retrievedElement2 = getElementByIndex(list2, 1);

        System.out.println("Извлеченные элементы из list1: " + retrievedElement1);
        System.out.println("Извлеченные элементы из list2: " + retrievedElement2);
        System.out.println("*****************************************");

        // Вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
        insertRandomElementByRandomIndex(list1);
        insertRandomElementByRandomIndex(list2);
        System.out.println("*****************************************");

        // Удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
        removeElementByRandomIndex(list1);
        removeElementByRandomIndex(list2);
        System.out.println("*****************************************");

        // Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
        removeElementByValue(list1);
        removeElementByValue(list2);
        System.out.println("*****************************************");
    }

    public static int getElementByIndex(List<Integer> lists, int index) {
        long startTime = System.currentTimeMillis(); // Засекаем начало
        if (index < 0 || index >= lists.size()) {
            System.out.println("Ошибка ввода index");
        }
        int element = lists.get(index);
        long endTime = System.currentTimeMillis(); // Засекаем конец
        System.out.println("Время выполнения метода getElementByIndex: " + (endTime - startTime) + " миллисекунд");
        return element;
    }

    public static void insertRandomElementByRandomIndex(List<Integer> lists) {
        long startTime = System.currentTimeMillis(); // Засекаем начало
        for (int i = 0; i < 2000; i++) {
            Random random = new Random();
            int index = random.nextInt(lists.size() + 1);
            int value = random.nextInt(11) - 10;
            lists.add(index, value);

        }
        long endTime = System.currentTimeMillis(); // Засекаем конец
        System.out.println("Время выполнения метода insertRandomElementByRandomIndex: " + (endTime - startTime) + " миллисекунд");
        System.out.println("Размер списка после вставки: " + lists.size());
    }

    public static void removeElementByRandomIndex(List<Integer> lists) {
        long startTime = System.currentTimeMillis(); // Засекаем начало
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            int index = random.nextInt(lists.size() + 1);
            lists.remove(index);

        }
        long endTime = System.currentTimeMillis(); // Засекаем конец
        System.out.println("Время выполнения метода removeElementByRandomIndex: " + (endTime - startTime) + " миллисекунд");
        System.out.println("Размер списка после удаления по индексу: " + lists.size());

    }

    public static void removeElementByValue(List<Integer> lists) {
//        int initialSize = lists.size(); // Запоминаем исходный размер
//        int targetSize = initialSize - 1000; // Вычисляем конечный размер
//
//        while (lists.size() > targetSize) {
//            Random random = new Random();
//            int value = random.nextInt(10001);
//            lists.remove((Integer.valueOf(value)));
//        }
        long startTime = System.currentTimeMillis(); // Засекаем начало
        int removed = 0;
        Random random = new Random();
        while (removed < 1000 && !lists.isEmpty()){
            int value = random.nextInt(10001);
                if (lists.remove((Integer.valueOf(value)))) {
                removed++;
            }

        }
        long endTime = System.currentTimeMillis(); // Засекаем конец
        System.out.println("Время выполнения метода removeElementByValue: " + (endTime - startTime) + " миллисекунд");
        System.out.println("Размер списка после удаления по значению: " + lists.size());


    }
}

