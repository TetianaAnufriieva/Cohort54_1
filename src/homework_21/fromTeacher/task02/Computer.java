package homework_21.fromTeacher.task02;

/*
Task 2
Компьютер и компоненты

Создайте базовый класс Component с полями brand (бренд) и model (модель).
Создайте производные классы: Processor, Memory, Storage от класса Component.
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.

Реализуйте отношения между Computer и компонентами.
Компоненты Processor и Memory не могу существовать без компьютера. // Композиция - часть не может существовать без целого
Часть создается вместе с целым
 */

public class Computer {
    private Processor processor; // жесткая связь - композиция
    private Memory memory; // жесткая связь - композиция
    private Storage storage; // мягкая связь - агрегация

    public Computer(Storage storage, String procBrand, String procModel) {
        this.storage = storage;
        this.processor = new Processor(procBrand, procModel);
        this.memory = new Memory("Crutial", "DDR-5400");
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}