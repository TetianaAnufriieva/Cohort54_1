package homework_15;

public class Table {
    String material;
    double length;
    double width;
    double height;
    String shape;

    public Table(String material, double length, double width, double height, String shape) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.height = height;
        this.shape = shape;
    }

    public void info(){
        System.out.printf("Материал, из которого изготовлен стол - %s, форма - %s, размеры: %.2f x %.2f x %.2f cm\n", material, shape, width, length, height);
    }

    public void useAsWorkplace() {
        System.out.println("Этот стол можно использовать как рабочее место.");
    }
}
