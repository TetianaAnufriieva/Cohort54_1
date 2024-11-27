package homework_22.task_03;

public class FigureApp {
    public static void main(String[] args) {

        Figure figureCircle = new Circle(5.5);
        Figure figureSquare = new Square(3.2);
        Figure figureTriangle = new Triangle(4.5, 5);

        Figure[] figures = new Figure[3];
        figures[0] = figureCircle;
        figures[1] = figureSquare;
        figures[2] = figureTriangle;

        for(int i = 0; i < figures.length; i++) {
            figures[i].calculateArea();
            System.out.println("\n**************\n");
        }
    }

}
