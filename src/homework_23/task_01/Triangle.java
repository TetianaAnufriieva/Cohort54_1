package homework_23.task_01;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double calculatePerimeter(){
        return a + b + c;

    }

    @Override
    public double calculateArea(){
        double p = calculatePerimeter() / 2;
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }


}
