package homework_26.task_01;

public class PairApp {

    public static void main(String[] args) {

        Pair<String> pair = new Pair<String>("Hello", "World");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.swap();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }
}
