package homework_20.Task2;

public class MainApp {
    public static void main(String[] args) {
        Tea tea = new Tea("Lipton", 400, 70, "Black", false);
        Juice juice = new Juice("BIO",1000,18,"apple", false);

        System.out.println(tea.toString());
        tea.addLemon();
        tea.addLemon();
        System.out.println("*******************\n");
        System.out.println(juice.toString());
        juice.shake();
        System.out.println("Cок свежий: " + juice.isFresh());




    }
}
