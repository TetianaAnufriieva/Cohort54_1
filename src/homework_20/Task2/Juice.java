package homework_20.Task2;

public class Juice extends Beverage {
    private String fruit;
    private boolean isFresh;

    public Juice(String name, double volume, double temperature, String fruit, boolean isFresh) {
        super(name, volume, temperature);
        this.fruit = fruit;
        this.isFresh = isFresh;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public String getFruit() {
        return fruit;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void shake(){
        System.out.println("Сок встряхнули.");

    }
}
