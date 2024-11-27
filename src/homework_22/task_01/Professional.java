package homework_22.task_01;

public class Professional extends Amateur {
    private final int speed = 25;
    private final int relaxTime = 5;

    @Override
    public void run(){
        System.out.println("Профи бежит со скоростью, км/ч= " + speed);
        rest();

    }
    @Override
    public void rest(){
        System.out.println("Количество минут, необходимых профи для отдыха = " + relaxTime);
    }
}
