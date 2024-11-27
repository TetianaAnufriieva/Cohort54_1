package homework_22.task_03;

public class Square extends Figure{

    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public void calculateArea(){
        double area = width * width;
        System.out.printf("Площадь квадрата: %.2f\n", area);
    }
}
