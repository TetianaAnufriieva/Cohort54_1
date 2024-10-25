/*
Task 2
Написать метод, принимающий на вход целое число.
Метод должен вывести на экран 2 в степени этоЧисло

Например: Если в метод пришло число 3 - метод должен вывести число 8
(так как 2 в степени 3 = 8)
класс Math для нахождения степени числа использовать нельзя ;)
 */


package homework_09;

public class Task2 {
    public static void main(String[] args) {

        int val = 3;
        power (val);

    } // Methods area
    public static void power (int pow){
        int i = 0;
        int result = 1;
        int number = 2;

        while (i < pow) {
            result *= number;
            i++;
        }
        System.out.printf("2 в степени %d равно %d", pow, result);
    }


} // End class
