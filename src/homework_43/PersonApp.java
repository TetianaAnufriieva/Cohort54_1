package homework_43;

public class PersonApp {
    public static void main(String[] args) {
        lesson_43.Person person = new lesson_43.Person("john@email.com", "qwerty");
        System.out.println(person);
        System.out.println("\n***************");
        lesson_43.Person testPerson = new lesson_43.Person("john.email.com", "qwerty");
        System.out.println(testPerson);

        System.out.println("\n***************");
        testPerson = new lesson_43.Person("john@ema%il.com", "qwerty");
        System.out.println(testPerson);

        System.out.println("\n***************");
        testPerson = new lesson_43.Person("@johnemail.com", "qwerty");
        System.out.println(testPerson);

        System.out.println("\n----------------------");
        Person person1 = new homework_43.Person("john@email.com", "Ab1!"); // не содержит 8 символов
        System.out.println(person1);

        System.out.println("\n***************");
        person1 = new homework_43.Person("john@email.com", "Ab1!4Qwe"); // корректный пароль
        System.out.println(person1);

        System.out.println("\n***************");
        person1 = new homework_43.Person("john@email.com", "Ab!!@Qwe"); // не содержит цифр
        System.out.println(person1);

        System.out.println("\n***************");
        person1 = new homework_43.Person("john@email.com", "Ab114Qwe"); // не содержит спец. символов
        System.out.println(person1);

        System.out.println("\n***************");
        person1 = new homework_43.Person("john@email.com", "ab1!4qwe"); // не содержит большой буквы
        System.out.println(person1);

        System.out.println("\n***************");
        person1 = new homework_43.Person("john@email.com", "AB1!4QWE"); // не содержит маленькой буквы
        System.out.println(person1);

    }
}
