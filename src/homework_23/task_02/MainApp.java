/*
Task 2
Создайте абстрактный класс GameCharacter, который представляет базовый класс для игровых персонажей.
Определите абстрактный метод attack(), который будет различаться для разных типов персонажей (например, воин атакует мечом, а маг использует магические заклинания).
Создайте несколько конкретных подклассов, представляющих разные типы персонажей, такие как Warrior, Mage, Archer, и т. д.
Переопределите метод attack() для каждого класса.
Создайте массив из игровых персонажей разных типов. Вызовите у каждого метод attack() в цикле.
 */
package homework_23.task_02;

public class MainApp {
    public static void main(String[] args) {

        GameCharacter[] gameCharacters = new GameCharacter[] {new Archer(), new Mage(), new Warrior()};

        for (int i = 0; i < gameCharacters.length; i++) {
            gameCharacters[i].attack();
            }
        }

}
