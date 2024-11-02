package homework_14;

import java.util.Scanner;

public class Task3Teacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово");


        String cyr = "аеиоуюя";

        String input = scanner.nextLine();
        calculateCharacter(input);


    }

    public static void calculateCharacter(String text) {

        int vowels = 0;
        int consonants = 0;

        String vowelsList = "AEIOUaeiou";


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // проверяем, что символ является буквой
            if (Character.isLetter(ch)) {
                // определяем какая это буква
                if (vowelsList.indexOf(ch) >= 0) {
                    // возвращает нам индекс вхождения символа в строку
                    // Если символ найден - вернется какое-то положительное число - индекс символа в строке
                    // Если символ не найден - метод вернет -1.
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }
}