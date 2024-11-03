package homework_15;

public class Wardrobe {
     String material;
     int doors;
     double height;
     double width;
     double depth;

    public Wardrobe(String material, int doors, double height, double width, double depth) {
        this.material = material;
        this.doors = doors;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void info(){
        System.out.printf("Материал, из которого изготовлен шкаф - %s, с %d дверьми, размеры: %.2f x %.2f x %.2f cm\n", material, doors, depth, width, height);
    }

    public void openDoors() {
        System.out.println("Двери шкафа открыты");
    }
}
