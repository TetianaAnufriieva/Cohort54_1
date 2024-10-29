/*
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.
Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.
Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций), и выведите результат.
Пример программы:
public class Main {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';
        // Ваш код
    }
}

Output:
HANNA

Пояснение
Переменные ch1, ch2, ch3, ch4 и ch5 должны быть преобразованы из нижнего регистра в верхний с использованием только арифметических операций.
Вывод результата должен быть в виде строки с именем в верхнем регистре.
 */

package homework_04;

public class Task4 {
    public static void main(String[] args) {

        char ch1 = 't';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'j';
        char ch5 = 'a';


        // Есть некая закономерность. Разница между нижним регистром и верхним одной и той же буквы латинского алфавита составляет 32
        // Переменная будет хранить букву t латинского алфавита, соответствующую коду 116 в десятичной системе счисления
        // Переменная будет хранить букву a латинского алфавита, соответствующую коду 97 в десятичной системе счисления
        // Переменная будет хранить букву n латинского алфавита, соответствующую коду 110 в десятичной системе счисления
        // Переменная будет хранить букву j латинского алфавита, соответствующую коду 106 в десятичной системе счисления
        // Переменная будет хранить букву a латинского алфавита, соответствующую коду 97 в десятичной системе счисления
        // Буква T латинского алфавита, соответствует коду 84 в десятичной системе счисления
        // Буква A латинского алфавита, соответствует коду 65 в десятичной системе счисления
        // Буква N латинского алфавита, соответствует коду 78 в десятичной системе счисления
        // Буква J латинского алфавита, соответствует коду 74 в десятичной системе счисления
        // Буква A латинского алфавита, соответствует коду 65 в десятичной системе счисления

        ch1 = (char) (ch1 - 32);
        ch2 = (char) (ch2 - 32);
        ch3 = (char) (ch3 - 32);
        ch4 = (char) (ch4 - 32);
        ch5 = (char) (ch5 - 32);

        System.out.printf("%c%c%c%c%c", ch1, ch2, ch3, ch4, ch5);

    }

}