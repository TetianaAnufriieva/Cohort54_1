package homework_22.task_01;

public class Person {
    private final int speed = 10;
    private final int relaxTime = 15;

    public Person() {

    }

    public int getSpeed() {
        return speed;
    }

    public int getRelaxTime() {
        return relaxTime;
    }

    public void run(){
        System.out.println("Человек бежит со скоростью, км/ч = " + speed);
        rest();

    }

    public void rest(){
        System.out.println("Количество минут, необходимых человеку для отдыха = " + relaxTime);
    }


}
