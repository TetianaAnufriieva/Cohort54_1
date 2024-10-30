/*
Task 3
Подсчет гласных и согласных
Напишите программу, которая просит пользователя ввести слово и
подсчитывает количество гласных и согласных букв в этом слове.
 */
package homework_14;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String str = scanner.nextLine();

        String vowels = "AaEeIiOoUuÄäÖöÜüАaЕeЁёИиОоУуЫыЭэЮюЯя";

        int sumVowels = 0;
        int sumConsonants = 0;

        for (int i = 0; i < str.length(); i++){
            char symbol = str.charAt(i);
            if (Character.isLetter(symbol)) {
                if (vowels.indexOf(symbol) != -1) {
                    sumVowels++;
                } else {
                    sumConsonants++;
                }

            }

        }
        System.out.println("Количество гласных букв в этом слове = " + sumVowels);
        System.out.println("Количество согласных букв в этом слове = " + sumConsonants);
    }
}

