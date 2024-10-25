/*
Task 0
Написать метод, принимающий на вход строку. Метод должен вывести на экран число,
соответсвующее количеству символов в строке.
Например: Если в метод пришла строка "hello" - метод должен вывести число 5
(так как в строке hello 5 символов)
 */


package homework_09;

public class Task0 {
    public static void main(String[] args) {
        getLength("hello");

    } // Methods area
    public static void getLength(String str) {
        int i = 0;
        int count = 0;
        while (i < str.length()) {
            count += 1;
            i++;
        }
        System.out.println(count);
    }

} // End class
