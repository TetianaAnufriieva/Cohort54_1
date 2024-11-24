package homework_20.FromTeacher;

public class Circle extends Shape {
    private double radius;
    public static final double PI = 3.14159;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double calculateArea() {
        double area = radius * radius * PI;
        System.out.println("The area of the circle is: " + area);
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
