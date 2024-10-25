/*
Дан следующий код. Вашей задачей является предсказать,
какой вывод будет напечатан в консоли после выполнения программы.

public class BooleanTest {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);
    }
}
Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.
 */


package homework_06;

public class Task4 {
    public static void main(String[] args) {

        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        // (8+3) > 10 , 11 больше 10 - true
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        // (8-3) == 5 , 5 равно 5 - true
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        // (8*3) != 24 , 24 равно 24
        // А по условию должно быть не равно - false
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        // (8/3) >= 2 , 2.67 больше 2 - true
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        // !(8%3) == 2 , остаток от деления 8 на 3 равен 2, 2 равно 2 - это true.
        // Знак ! означает логическое НЕ (NOT) - отрицание.
        // Меняет значение типа boolean на противоположное, т.е. false в нашем случае
        System.out.println("Result 5: " + result);
    }
}
