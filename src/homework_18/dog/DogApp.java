package homework_18.dog;

public class DogApp {
    public static void main(String[] args) {

        Dog dog = new Dog("Bob", 20);
        dog.jump();
        dog.train();
        dog.jumpBarrier(30);
        dog.jumpBarrier(50);
    }
}
