package lesson_28.persons.test;

import lesson_28.persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty10$";

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
        2. Set it with person.set()
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
}
