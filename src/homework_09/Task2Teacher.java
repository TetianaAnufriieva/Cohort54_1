package homework_09;

public class Task2Teacher {
    public static void main(String[] args) {
        int pow = 10;

        powTwo(pow);


    }

    // methods area

    public static void powTwo(int n) {
        // 2 ^ 3 = 1 * 2 * 2 * 2
        // 2 ^ 0 = 1;

        // Запоминаю, пришла изначально положительная степень или отрицательная
        boolean isPositive = n >= 0;

        // n = (isPositive) ? n : n * -1;

        // Если НЕ положительно
        if (!isPositive) n *= -1; // n = n * -1;



        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= 2;
        }

        if (isPositive) {
            System.out.printf("2 ^ %d = %d\n", n, result);
        } else {
            System.out.printf("2 ^ %d = %.4f\n", n, 1.0 / result);
        }

    }


}