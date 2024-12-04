package homework_24.task_01;

public class Triathlete implements Swimmer, Runner{

    public Triathlete() {
    }


    @Override
    public void run() {
        System.out.println("For Ironman you need to run 42,2 km");
    }

    @Override
    public void swim() {
        System.out.println("For Ironman you need to swim 3,8 km");

    }
}
