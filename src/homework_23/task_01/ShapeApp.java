/*
Task 1
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */
package homework_23.task_01;

public class ShapeApp {
    public static void main(String[] args) {

        Shape figureCircle = new Circle(5.5);
        Shape figureRectangle = new Rectangle(3.2, 2.3);
        Shape figureTriangle = new Triangle(4.5, 5, 6);

        Shape[] shapes = new Shape[3];
        shapes[0] = figureCircle;
        shapes[1] = figureRectangle;
        shapes[2] = figureTriangle;

        double sumAreaTotal = 0;
        double sumPerimeterTotal = 0;
        for(int i = 0; i < shapes.length; i++) {
            sumAreaTotal = shapes[i].calculateArea() + sumAreaTotal;
            sumPerimeterTotal = shapes[i].calculatePerimeter() + sumPerimeterTotal;
        }

        System.out.printf("sumArea: %.2f\n", sumAreaTotal);
        System.out.printf("sumPerimeter: %.2f\n", sumPerimeterTotal);

//        System.out.println(figureCircle.calculateArea());
//        System.out.println(figureRectangle.calculateArea());
//        System.out.println(figureTriangle.calculateArea());

    }

}
