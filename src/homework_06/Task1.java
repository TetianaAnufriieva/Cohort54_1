/*
Дан текст Programming is fun.

Напишите программу, которая проверяет, содержит ли эта строка слово “fun”,
и выведите результат в виде булевой переменной.
 */


package homework_06;

public class Task1 {
    public static void main(String[] args) {

        String str = "Programming is fun";
        boolean index = str.contains("fun");
        System.out.printf("Cтрока %s содержит слово “fun” - %b", str, index);

    }
}
