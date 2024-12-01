package homework_22.task_02_fromTeacher;

public class Car extends Vehicle{

    public Car(Engine engine) {
        super();
        setEngine(engine);
    }

    @Override
    public void startEngine() {
        System.out.println("Car starting engine");
        this.getEngine().start();
    }

}