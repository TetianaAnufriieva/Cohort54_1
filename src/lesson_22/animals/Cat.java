package lesson_22.animals;

public class Cat extends Animal {

    // переопределить родительский метод voice


    @Override // указывает, что я переопределяю родительский метод
    public void voice() {
        System.out.println("Cat says MEOW!");
    }

    public void eat(){
        System.out.println("Cat is eating");

    }

    // Перегрузка метода - статический полиморфизм
    public void eat(String food){
        System.out.println("Cat is eating" + food);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
