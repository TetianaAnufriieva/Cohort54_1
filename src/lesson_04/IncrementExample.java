package lesson_04;

public class IncrementExample {
    public static void main(String[] args) {

        int var = 5;

        var = var + 10;
        System.out.println("var: " + var);

        var += 2; // var = var + 2;
        System.out.println("var + : " + var);

        var -= 2; // var = var - 2;
        System.out.println("var - : " + var);

        var *= 2; //var = var * 2

        var /= 2; // var = var / 2

        System.out.println("var: " + var);

        // Инкремент, декремент
        var++; // var = var + 1; var += 1; // Увеличить текущее значение переменной на 1
        System.out.println(var);
        var--; // var = var - 1; var -= 1; Уменьшить текущее значение переменной на 1

        //
        System.out.println(" ==================== ");
        int x = 100;
        System.out.println("x: " + x++);
        System.out.println("x: " + x);

        //
        int y = 100;
        System.out.println("y: " + ++y);
        System.out.println("y: " + y);


    }
}
