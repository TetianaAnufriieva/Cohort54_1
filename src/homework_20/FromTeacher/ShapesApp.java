package homework_20.FromTeacher;

public class ShapesApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Прямоугольник", "Red");

        rectangle.setDimensions(5.5, 7.43);

        rectangle.displayInfo();
        rectangle.calculateArea();

        Rectangle rectangle1 = new Rectangle("Rectangle", "Yellow", 10, 20);
        rectangle1.displayInfo();
        rectangle1.calculateArea();


        System.out.println("Circle");

        Circle circle = new Circle("Circle", "Blue", 1);
        circle.setRadius(10);
        circle.displayInfo();
        circle.calculateArea();

    }
}