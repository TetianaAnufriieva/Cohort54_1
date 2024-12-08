/*
Task2: Мастерская ремонта гаджетов
Опционально
Создать систему для моделирования работы мастерской по ремонту различных гаджетов, таких как смартфоны и ноутбуки.

Условия задачи:
Создайте интерфейс Repairable, который содержит методы:

diagnose() — провести диагностику устройства.
repair() — выполнить ремонт устройства.
getRepairCost() — получить стоимость ремонта.
У всех гаджетов должны быть:

Поля:
ownerName — имя владельца гаджета.
model — модель устройства.
repairCost — стоимость ремонта.
Конструктор для инициализации этих полей.
Реализацию метода getRepairCost(), который возвращает значение поля repairCost.
Реализуйте два класса:

Smartphone (подкласс Gadget):
Реализуйте метод diagnose() (например, проверка экрана и батареи).
метод repair() с учетом особенностей ремонта смартфона (например, "Замена экрана завершена").
Laptop (подкласс Gadget):
Реализуйте метод diagnose() (например, проверка состояния жесткого диска и системы охлаждения).
Дополните метод repair() с учетом ремонта ноутбука (например, "Замена кулера завершена").
Создайте класс Workshop, который выполняет:

Метод processRepair(Gadget gadget), который:
Проводит диагностику устройства.
Ремонтирует устройство.
Выводит информацию о завершении ремонта и его стоимости.
Опционально:
Реализуйте метод estimateRepairTime(), который возвращает время ремонта в зависимости от сложности устройства.
Добавьте класс Tablet как еще один подкласс Gadget, чтобы показать расширяемость системы.
 */

package homework_25.gadgets;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Bob", "MacBook Pro (M3 Pro/M3 Max)", 500);
        Smartphone smartphone = new Smartphone("Tim", "iPhone 15 Pro Max", 350);
        Tablet tablet = new Tablet("Kristina", "iPad Pro", 420);

        Workshop workshop = new Workshop();
        workshop.processRepair(smartphone);
        workshop.processRepair(laptop);
        workshop.processRepair(tablet);

    }
}
