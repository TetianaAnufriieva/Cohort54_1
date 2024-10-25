/*
--Неявное преобразование int в double
Напишите программу, которая:
Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.
Ожидаемый результат:
Значение myDouble: 10.0
 */

package homework_04;

public class Task1 {
    public static void main(String[] args) {

        int Var1 = 10;
        double myDouble = Var1;
        System.out.println("Значение myDouble: " + myDouble);

    }
}
