package homework_19;

public class ImmutablePointApp {
    public static void main(String[] args) {

        ImmutablePoint immutablePoint = new ImmutablePoint(100,200);

        System.out.println("Task3:");
        System.out.println("x = " + immutablePoint.getX());
        System.out.println("y = " + immutablePoint.getY());

        System.out.println("Task4:");
        ImmutablePoint.printMessage("Hello World");
    }
}
