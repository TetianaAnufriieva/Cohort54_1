package homework_22.task_03;

public class Circle extends Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.printf("Площадь круга: %.2f\n", area);
    }
}
