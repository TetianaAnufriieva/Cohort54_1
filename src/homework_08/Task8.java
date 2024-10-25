/*
Task 8 * (Опционально)
Написать метод, который принимает массив строк.
Вывести на экран все символы самой длинной строки из массива.
Пример:
{ "One", "Two", "Twenty" } ->
T
w
e
n
t
y
 */
package homework_08;

public class Task8 {
    public static void main(String[] args) {
        String[] array = new String[]{"One", "Two", "Twenty"};
        int i = 0;
        int j = 0;
        String maxValue = array[0];

        while (i < array.length) {
            if (maxValue.length() < array[i].length()) maxValue = array[i];

            i++;
        }
        System.out.println(maxValue);

        while (j < maxValue.length()) {
            System.out.println(maxValue.charAt(j));

            j++;
        }

    }
}
