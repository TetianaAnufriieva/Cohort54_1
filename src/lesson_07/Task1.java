package lesson_07;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int money = 100;

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int grade  = scanner.nextInt();
        scanner.nextLine();
        */


        Random random = new Random();
        int grade = random.nextInt(5)+1;
        System.out.println("Случайное число grade = " + grade);


        if (grade == 5) {
            money += 20; // money = money + 20;
            System.out.println("Оценка: " + grade);
            System.out.println("Всего осталось денег: " + money);
        } else if (grade == 4) {
            money += 10;
            System.out.println("Оценка: " + grade);
            System.out.println("Всего осталось денег: " + money);
        } else if (grade == 3) {
            System.out.println("Оценка: " + grade);
            System.out.println("Всего осталось денег: " + money);
        } else if (grade == 2) {
            System.out.println("Оценка: " + grade);
            money -= 10;
            System.out.println("Всего осталось денег: " + money);
        } else if (grade == 1) {
            System.out.println("Оценка: " + grade);
            money = 0;
            System.out.println("Забирают все деньги");
        } else {
            System.out.println("Не получил оценку");
        }

        System.out.println("-------------\n");

        int v1 = random.nextInt(51);
        int v2 = random.nextInt(51);
        int v3 = random.nextInt(51);

        System.out.println(v1 + "|" + v2 + "|" + v3);

        int min = v1;
        if (v2 < min) {
            min = v2;
        }
        if (v3 < min) min = v3;
        System.out.println("min значение: " + min);

    }
}
