/*
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

package homework_09;

public class Task5 {
    public static void main(String[] args) {

        String[] arr = { "One", "Two", "Twenty" };
        longestString(arr);

    } // Methods area

    public static void longestString(String[]array){
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

} // End class
