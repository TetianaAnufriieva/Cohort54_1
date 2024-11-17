/*
Task 3
Неизменяемый объект
Создайте класс ImmutablePoint:
•	Объявите final поля x и y типа int.
•	Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
 */

/*
Task4 * (Опционально)
Final параметр метода
•	Напишите метод printMessage(final String message), который выводит сообщение на экран.
•	Попробуйте изменить значение параметра message внутри метода.
•	Объясните результат и поведение компилятора.
 */
package homework_19;

public class ImmutablePoint {

    final int x;
    final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

//    Task3
//    Методы-сеттеры для изменения значений x и y создавать нельзя, да и не получится,
//    потому что запрещается переприсваивать значение переменной с модификатором final
//    public void setX(int x) {
//        this.x = x;
//    }
//    public void setY(int y) {
//        this.y = y;
//    }

    public static void printMessage( final String message){
        System.out.println("Исходное сообщение: " + message);

//        Task4
//        Параметр метода объявлен как final, поэтому его значение (ссылку)
//        нельзя изменять внутри метода после инициализации.
//        message = "Guten Abend!";
//        System.out.println("Измененное сообщение: " + message);
    }

}
