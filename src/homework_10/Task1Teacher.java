package homework_10;

import java.util.Arrays;

public class Task1Teacher {
    public static void main(String[] args) {

        // [0, 1, 2, 3, 4, 5, 6]
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};

        copyOfArray(numbers, 3);

        int[] numbers2 = {0, 1, 2};
        copyOfArray(numbers2, 5);

        int[] ints = null;
        copyOfArray(ints, 5);


    }

    public static void copyOfArray(int[] array, int newLength) {

        if (array == null) {
            // В void оператор return заканчивает работу метода.
            return;
        }

        // [0, 0, 0, 0]
        int[] result = new int[newLength];

        /*
            Массив всегда при создании заполняется значениями по усолчанию
            числовые типы (в том числе char) -> 0 / 0.0
            boolean -> false
            ссылочные типы данных (в том числе String) -> null
         */

        System.out.println("длина source: " + array.length);
        System.out.println("длина result: " + result.length);

        // Цикл закончит свою работу как только i выйдет за границы любого из двух массивов
        for (int i = 0; i < array.length && i < result.length  ; i++) {
            System.out.println("Текущий индекс: " + i);
            result[i] = array[i];
        }

        // Метод возвращает строковое представление массива
//        String arrayStr = Arrays.toString(result);
//        System.out.println(arrayStr);
        System.out.println(Arrays.toString(result));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
