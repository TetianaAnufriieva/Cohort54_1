/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.

Task2 (*Опционально):
Напишите метод, возвращающий частотный словарь вхождения символов в строку
 */
package homework_39;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1_2 {

    public static void main(String[] args) {


        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.println("'" + k + "': " + v+ "; "));
        System.out.println();

    }

    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        Map<Character, Integer> charNumber = new HashMap<>();

        for (Character ch : text.toCharArray()) {
            charNumber.put(ch, charNumber.getOrDefault((ch), 0) + 1);

        }
        return charNumber;
    }
    private static Map<String, Integer> frequencyDictionary(String text) {
        Map<String, Integer> wordNumber= new HashMap<>();
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");
        System.out.println(Arrays.toString(words));

        for (String word : words){
            if (!word.isEmpty()){
                wordNumber.put(word, wordNumber.getOrDefault((word), 0)+1);
            }
        }
        return wordNumber;
    }
}
