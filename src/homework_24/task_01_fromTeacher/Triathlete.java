package homework_24.task_01_fromTeacher;

public class Triathlete implements Swimmer, Runner {

    @Override
    public void run() {
        System.out.println("Triathlete is running");
    }

    @Override
    public void swim() {
        System.out.println("Triathlete is swimming");
    }
}
