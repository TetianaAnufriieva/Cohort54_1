/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */

package homework_22.task_01;

public class MainApp {
    public static void main(String[] args) {

        Person person = new Person();
        Amateur amateur = new Amateur();
        Professional professional = new Professional();

        person.run();
        System.out.println("\n*********\n");
        amateur.run();
        System.out.println("\n*********\n");
        professional.run();

    }
}
