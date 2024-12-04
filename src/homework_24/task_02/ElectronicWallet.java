package homework_24.task_02;

public class ElectronicWallet implements PaymentSystem{

    private double balance;
    private String currency;

    public ElectronicWallet(double balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0 && balance >= amount){
            balance -= amount;
            System.out.printf("Withdraw money, in %s = %.2f \n", currency, amount);
        } else{
            System.out.println("Incorrect amount or no money");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.printf("Deposit transfer, in %s = %.2f \n", currency, amount);
        } else{
            System.out.println("Incorrect amount");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
