package homework_18.fromTeacher;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        System.out.println("double division");
        return a / b;
    }

    public static int divide(int a, int b) {
        System.out.println("int division");
        if (b == 0) {
            // Todo хорошего решения нет.
            return Integer.MAX_VALUE;
        }
        return a / b;
    }


}
