package homework_24.task_01_fromTeacher;

public class Task1App {
    public static void main(String[] args) {

        Triathlete triathlete = new Triathlete();
        triathlete.run();
        triathlete.swim();

        if (triathlete instanceof Swimmer) {
            Swimmer swimmer = (Swimmer) triathlete;
            swimmer.swim();
        }
//
//        Swimmer athlete = new Triathlete();
//        athlete.swim();

        if (triathlete instanceof Runner) {
            Runner runner = (Runner) triathlete;
            runner.run();
        }


    }
}
