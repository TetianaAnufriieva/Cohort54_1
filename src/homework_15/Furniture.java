/*
Task 1
Посмотрите вокруг себя.
Напишите три класса, описывающие какие-то сущности вокруг Вас.
Не забудьте использовать абстракцию.
Например, опишите студента, преподавателя и, допустим, врача.
Вы можете выбрать свои сущности для описания.
 */

package homework_15;

public class Furniture {

    String name;
    String color;
    String material;
    double weight;

    public Furniture() {

    }

    public Furniture(String name, String color, String material, double weight) {

        this.name = name;
        this.color = color;
        this.material = material;
        this.weight = weight;

    }
    public void info() {
        System.out.printf("Найменование мебели - %s, цвет - %s, изготовлен из - %s, весом %2.f кг.\n", name, color, material, weight);
    }
}
