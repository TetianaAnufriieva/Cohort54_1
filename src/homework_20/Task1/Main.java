package homework_20.Task1;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("circle", 2.5);
        Rectangle rectangle = new Rectangle("rectangle",10.5, 5.5);

        circle.setName("Круг");
        circle.setColor("Красный");
        circle.setRadius(3);
        circle.displayInfo();
        circle.calculateArea();

        rectangle.setName("Прямоугольник");
        rectangle.setColor("Зелёный");
        rectangle.setDimensions(0, 5);
        rectangle.displayInfo();
        rectangle.calculateArea();

    }
}
