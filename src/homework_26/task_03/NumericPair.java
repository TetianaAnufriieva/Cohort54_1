package homework_26.task_03;

public class NumericPair <T extends Number>{

    private T firstNumber;
    private T secondNumber;

    public NumericPair(T firstNumber, T secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double sum(){
        double sum = firstNumber.doubleValue() + secondNumber.doubleValue();
        return sum;
    }
}
