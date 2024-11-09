package homework_17;

public class ArrayApp {
    public static void main(String[] args) {
        int[] ints = {10, 20, 50, -25, 35, 50, 45, 100, 50, -1, 150};
        MagicArray17 magicArray = new MagicArray17(ints);

        System.out.println(magicArray.toString());

        System.out.println("lastIndexOf (50): " + magicArray.lastIndexOf(50));

        System.out.println(magicArray.toArray());
    }
}
