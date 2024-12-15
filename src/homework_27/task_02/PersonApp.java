/*
Task 2
Написать в классе Person метод для проверки валидности Password
 */

package homework_27.task_02;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("test@test.net.de", "assworpdФ2! ");
        System.out.println(person);

        Character.isLowerCase('v');
        Character.isUpperCase('v');
        Character.isDigit('v');

    }
}
