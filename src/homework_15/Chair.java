package homework_15;

public class Chair {
    double seatDepth;
    double seatWidth;
    double seatHeight;
    double depth;
    double width;
    double height;

    public Chair(String name, String color, String material, double weight, double depth,
                 double width, double height, double seatDepth, double seatWidth,
                 double seatHeight) {

        this.seatDepth = seatDepth;
        this.seatWidth = seatWidth;
        this.seatHeight = seatHeight;
        this.depth = depth;
        this.width = width;
        this.height = height;

    }

    public void applying() {
        System.out.println("На стуле сидят");
    }


}
