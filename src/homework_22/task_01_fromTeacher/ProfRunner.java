package homework_22.task_01_fromTeacher;

public class ProfRunner extends AmateurRunner{

    {
        this.setTypeRunner("Профессионал");
    }

    public ProfRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }

    public ProfRunner() {
        super(25, 5);
    }
}