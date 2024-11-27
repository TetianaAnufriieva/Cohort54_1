package homework_22.task_03;

public class Triangle extends Figure{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea(){
        double area = 0.5 * base * height;
        System.out.printf("Площадь треугольника: %.2f\n", area);
    }
}
