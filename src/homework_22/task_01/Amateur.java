package homework_22.task_01;

public class Amateur extends Person{
    private final int speed = 15;
    private final int relaxTime = 10;

    @Override
    public void run(){
        System.out.println("Любитель бежит со скоростью, км/ч = " + speed);
        rest();

    }
    @Override
    public void rest(){
        System.out.println("Количество минут, необходимых любителю для отдыха = " + relaxTime);
    }
}
