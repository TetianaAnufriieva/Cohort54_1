package lesson_22.animals;

public class Animal {

    public void voice(){
        System.out.println("Animal says something");
    }

    // Полиморфизм. Переопределение метода родительского класса - Object
    public String toString(){
        return "Animal to String";
    }
}
