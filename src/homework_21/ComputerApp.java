package homework_21;

public class ComputerApp {
    public static void main(String[] args) {
    Storage storage = new Storage("Seagate", "FireCuda 530 NVMe SSD");
    Computer computer = new Computer("G.Skill", "Trident Z5 RGB DDR5 32GB (6000 MHz)", "AMD", "Ryzen 9 7950X", storage);
        System.out.println(computer.toString());


    }
}
