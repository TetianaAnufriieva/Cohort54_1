package homework_22.task_01_fromTeacher;

public class AmateurRunner extends Human{

    public AmateurRunner() {
        super(15, 10);
        this.setTypeRunner("Любитель");
    }

    public AmateurRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }
}