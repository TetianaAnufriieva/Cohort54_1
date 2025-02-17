/*
Task 3
Опционально
Написать метод, возвращающий первый неповторяющийся символ в строке
 */
package homework_38;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(firstUniqueChar(string));
    }

    private static String firstUniqueChar(String string) {
        // Заменяем все НЕбуквы на пустоту
        String newStr = string.replaceAll("[^a-zA-Z0-9а-яА-Я]", "");
        System.out.println(newStr);

        // Преобразуем строку в массив букв
        char[] letters = newStr.toCharArray();
        System.out.println(Arrays.toString(letters));

        for (char letter : letters) {
            if (string.indexOf(letter) == string.lastIndexOf(letter)) { // встречается ли буква (letter) только один раз в строке (string)

                return String.valueOf(letter);
            }
        }
        return null;

    }
}
