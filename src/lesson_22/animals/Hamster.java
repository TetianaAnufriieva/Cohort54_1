package lesson_22.animals;

public class Hamster extends Animal {

    @Override
    public void voice() {
        System.out.println("Hamster voice hrum-hrum");
    }

    @Override
    public String toString() {
        return super.toString() + " | Hamster. Дополнение реализации род. метода";
    }
}
