package homework_23.task_01;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * (width + height);

    }

    @Override
    public double calculateArea(){
        return width * height;

    }


}
