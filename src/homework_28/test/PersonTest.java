/*
Task1
Написать тестовый метод для проверки работы с "не валидными" email в классе Person. Тестовые данные должны содержать максимально полный набор не валидных email-ов
С двумя собаками
без точки после собаки
и так далее
Task2
Написать тесты установки пароля в классе Person. Валидные / не валидные пароли.
 */

package homework_28.test;

import lesson_28.persons.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "Qwerty10$";

    @BeforeEach
    void setUp(){
        person = new Person(startEmail, startPassword);

    }

    @Test
    void testValidEmailSet(){
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);
        assertEquals(validEmail , person.getEmail());
        assertNotEquals(startEmail, person.getEmail());
    }

    /*
        1. Take invalid Email
        2. Set it with person.setEmail()
        3. ER: invalid Email will not be set
     */
    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail){
        person.setEmail(invalidEmail);
        assertNotEquals(invalidEmail, person.getEmail());
        assertEquals(startEmail, person.getEmail());

    }

    static Stream<String> invalidEmailData(){
        return Stream.of("testmail.net",
                "test@@mail.net",
                "@mail.net",
                "-mail@1",
                "test@test1@.com",
                "test2@com..",
                "t#est@mail.net",
                "1test@mail.net",
                "_test@mail.net",
                "test@mailnet");
    }

    @Test
    void testValidPasswordSet(){
        String validPassword = "Pass$@&word1!]";

        person.setPassword(validPassword);
        assertEquals(validPassword , person.getPassword());
        assertNotEquals(startPassword, person.getPassword());
    }

    /*
        1. Take invalid Password
        2. Set it with person.setPassword()
        3. ER: invalid Password will not be set
     */
    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    void testInvalidPasswordSet(String invalidPassword){
        person.setPassword(invalidPassword);
        assertNotNull(person.getPassword());
        assertNotEquals(invalidPassword, person.getPassword());
        assertEquals(startPassword, person.getPassword());

    }

    static Stream<String> invalidPasswordData() {
       //"!%$@&*()[]"
        return Stream.of("a",
                "qwer!1Q", //короткий
                "ERYTYRTYT%555", // без маленькой буквы
                "48asd*dfg", // без большой буквы
                "WeR(reF[D", // без цифры
                "5TgdfgfRE50"); // без спец.символа
    }

}
