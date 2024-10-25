/*

Task 2.2 * (Опционально)
Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.

 */

package homework_05;

public class Task2_2 {
    public static void main(String[] args) {

        String val = "Java is a powerful language";
        String replace = val.replace("powerful", "super");
        System.out.println(val);
        System.out.println(replace);

        boolean isContains = replace.contains("age");
        System.out.println("isContains: " + isContains);

    }
}
