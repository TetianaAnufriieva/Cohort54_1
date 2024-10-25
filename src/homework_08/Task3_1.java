/*
Task 3.1 * (Опционально)
Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
 */


package homework_08;

public class Task3_1 {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;

        while (count < 7 && i <= 100){
            if (i % 5 == 0) {
                System.out.print(i + " | ");
                count += 1;
                i += 5; // перебераем с шагом 5 после первого найденного числа, которое делится на 5.
            } else {
                i++;
            }
            }
        }

    }

