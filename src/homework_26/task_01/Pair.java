package homework_26.task_01;

public class Pair <T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T value) {
        this.first = value;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T value) {
        this.second = value;
    }

    public void swap(){
        T temp = first;
        first = second;
        second = temp;
    }
}
