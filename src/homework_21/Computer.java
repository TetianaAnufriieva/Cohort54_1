package homework_21;

public class Computer {

    private Memory memory; // композиция (жесткая и неразрывная связь)
    private Processor processor; // композиция (жесткая и неразрывная связь)
    private Storage storage; // агрегация (мягкая связь)

    public Computer(String brandMemory, String modelMemory, String brandProcessor, String modelProcessor, Storage storage) {
        this.memory = new Memory(brandMemory, modelMemory);
        this.processor = new Processor(brandProcessor, modelProcessor);
        this.storage = storage;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ("Computer: {");
        sb.append("memory: ").append(memory);
        sb.append(", processor: ").append(processor);
        sb.append(", storage: ").append(storage);
        sb.append("}");
        return sb.toString();

    }
}
