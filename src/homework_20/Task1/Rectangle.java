package homework_20.Task1;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public void setDimensions(double width, double height){
        if (width <= 0 || height <= 0){
            System.out.println("Значение ширины и длины должны быть больше 0");
            return;
        }
        this.width = width;
        this.height = height;
    }

    public void calculateArea(){
        double areaR = width * height;
        System.out.println("Площадь прямоугольника: " + areaR);
    }

}
