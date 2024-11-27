package lesson_22.animals;

public class ZooApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.voice();
        System.out.println(cat.toString());

        System.out.println("\n----Dog-------\n");
        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());

        System.out.println("\n----Hamster-------\n");
        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());
    }
}
