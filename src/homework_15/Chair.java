package homework_15;

public class Chair {

        String color;
        String material;
        double length;
        double width;
        double height;
        String isSoft;

        public Chair (String material, String color, double length, double width, double height, String isSoft){
            this.color = color;
            this.material = material;
            this.length = length;
            this.width = width;
            this.height = height;
            this.isSoft = isSoft;
        }

        public void info(){
            System.out.printf("Материал, из которого изготовлен стул - %s, цвет - %s, размеры: %.2f x %.2f x %.2f cm, он мягкий - %s \n", material, color, length, width, height, isSoft);
        }

        public void sit() {
            System.out.println("Вы можете присесть на стул");
        }
}
