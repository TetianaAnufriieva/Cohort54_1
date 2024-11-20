package homework_20.Task1;

public class Circle extends Shape {

    //private static final double PI = 3,14;
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public void setRadius(double radius){
        if (radius <= 0){
            System.out.println("Значение радиуса должно быть больше 0");
            return;
        }
        this.radius = radius;
        System.out.println("Радиус круга: " + radius);
    }

    public void calculateArea(){
        double areaC = Math.PI * radius * radius;
        System.out.printf("Площадь круга: %.2f\n", areaC);
    }

}
