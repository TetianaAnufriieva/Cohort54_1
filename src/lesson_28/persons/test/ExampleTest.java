package lesson_28.persons.test;

import com.sun.jdi.Value;
import lesson_27.enums.days.Day;
import lesson_28.persons.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

// Метод, помеченный @BeforeEach, будет выполняться перед каждым тестовым методом
    @BeforeEach
    void setUp(){
        System.out.println("Метод, помеченный @BeforeEach");
    }
    /*
    @BeforeEach - будет выполняться перед каждым тестовым методом
    @BeforeAll - метод выполнится только 1 раз перед выполнением первого теста (требует static)
    @AfterEach  - будет выполняться после каждого тестового метода
    @AfterAll - метод выполнится только 1 раз после выполнения последнего теста (требует static)
    @Disabled - указывает, что тест отключен и выполнять метод не требуется
     */


    // Указывает, что метод является тестовым. Таким образом JUnit знает,
    // что этот метод нужно запустить во время выполнения тестов
    @Test
    public void testAddition(){
        System.out.println("Test addition");

        int result = 2 + 2;
        // Методы проверки утверждений

        // assertEquals(expected, actual)
        Assertions.assertEquals(4, result); // проверяет равны ли 2 значения
        assertNotEquals(9, result); // тест будет пройден, если  "неожидаемый результат" не равен фактическому
        assertTrue(result >= 4); // проверяет, что условие верно (return true)
        assertFalse(result > 4); // проверяет, что условие ложно (return false)
        assertNull(null); // проверяет, что объект равен null
        assertNotNull("String"); // проверяет, что объект не равен null
    }

    @Disabled
    @Test
    public void emptyTest(){
        System.out.println("Empty test");
        // Пустой тестовый метод считается успешно пройденным,
        // Т.к. в методе нет ложного утверждения
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 9, 11})
    public void testNumbers(int number){
        System.out.println("number= " + number);
        assertTrue(number > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    public void testFruit(String fruit){
        System.out.println("fruit= " + fruit);
        assertTrue(fruit.length() > 2);
    }

//    apple,1
//    banana,2
//    CSV - Comma - Separated - Value

    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
    void testWithCsvSourse(String fruit, int rank){
        System.out.println(fruit + " | " + (rank + 10));
        assertTrue(fruit.length() > 4 && rank > 0);
    }

    // Data source - data.csv
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testWithCsvFileSource(String fruit, int rank, boolean flag){
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertNotNull(fruit);
        assertTrue (rank > 0);
    }

    @ParameterizedTest
    @EnumSource(Day.class)
    void testEnums(Day day){
        System.out.println("day= " + day);
        assertNotNull(day);
    }

    @ParameterizedTest
    @MethodSource("testDataString")
    public void testWithMethodSource(String argument){
        System.out.println("argument= " + argument);
        assertNotNull(argument);
    }

    static Stream<String> testDataString(){
        return Stream.of("apple", "banana", "cherry");
    }

    static Stream<Integer> testDataInteger(){
        return Stream.of(1, 2, 3, 4);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSource2(int value, int expected, boolean isEquals){
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value * value;
        assertEquals(isEquals, result == expected);
    }

    static Stream<Arguments> testDataArguments(){
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );

    }
    @ParameterizedTest
    @MethodSource("testPersonData")
    void testPersonData(Person person, String email){

    }

    static Stream<Arguments>testPersonData(){
        Person person = new Person("test@mail.net", "pass1Q!4");
        return Stream.of(
                Arguments.of(person, "new1234@mail.net"),
                Arguments.of(new Person("invalid.email.com", "password"), "mail.test.com")
        );
    }

}