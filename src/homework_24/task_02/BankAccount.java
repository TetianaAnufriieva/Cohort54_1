package homework_24.task_02;

public class BankAccount implements PaymentSystem {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("Withdraw money, in EU = " + amount);
        } else{
            System.out.println("Incorrect amount or no money");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit transfer, in EU = " + amount);
        } else{
            System.out.println("Incorrect amount");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}


