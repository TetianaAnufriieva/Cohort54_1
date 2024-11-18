package homework_18.dog;

public class DogApp {
    public static void main(String[] args) {

        Dog dog = new Dog("Bob", 33);
        dog.jump();
        dog.train();
        dog.jumpBarrier(64);
        dog.jumpBarrier(65);
        dog.jumpBarrier(66);
    }
}
