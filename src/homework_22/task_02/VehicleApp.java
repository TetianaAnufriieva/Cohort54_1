/*
Task 2
Создайте иерархию классов для разных типов транспортных средств: Vehicle (родительский класс), Car, Bicycle и Motorcycle (дочерние классы).
Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации.
Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть).
Создайте массив транспортных средств разных типов. Используйте полиморфизм для вызова метода startEngine() для каждого транспортного средства.
 */

package homework_22.task_02;

public class VehicleApp {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Bicycle();
        Vehicle vehicle2 = new Car();
        Vehicle vehicle3 = new Motorcycle();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = vehicle1;
        vehicles[1] = vehicle2;
        vehicles[2] = vehicle3;

        for (int i = 0; i < vehicles.length; i++){
            vehicles[i].startEngine();
            System.out.println("\n**************\n");
        }


    }
}
