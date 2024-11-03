/*
Task 1
Посмотрите вокруг себя.
Напишите три класса, описывающие какие-то сущности вокруг Вас.
Не забудьте использовать абстракцию.
Например, опишите студента, преподавателя и, допустим, врача.
Вы можете выбрать свои сущности для описания.
 */
package homework_15;

public class FurnitureMain {
    public static void main(String[] args) {

        Table table = new Table("дерево", 120, 60, 80, "прямоугольный");
        Chair chair = new Chair("пластик", "белый", 36, 44, 45, "да");
        Wardrobe wardrobe = new Wardrobe("дерево", 2, 200, 100, 50);

        table.info();
        table.useAsWorkplace();

        chair.info();
        chair.sit();

        wardrobe.info();
        wardrobe.openDoors();
    }
}
