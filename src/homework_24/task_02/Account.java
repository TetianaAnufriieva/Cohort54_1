package homework_24.task_02;

public class Account implements PaymentSystem{
    private double balance;
    private String currency;
    private String accountName;

    public Account(double balance, String currency, String accountName) {
        this.balance = balance;
        this.currency = currency;
        this.accountName = accountName;
    }

    @Override
    public String getAccountName() {
        return accountName;
    }


    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0 && balance >= amount){
            balance -= amount;
            System.out.printf("Withdraw money = %.2f %s \n", amount, currency);
        } else{
            System.out.println("Incorrect amount or no money");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.printf("Deposit transfer = %.2f %s \n", amount, currency);
        } else{
            System.out.println("Incorrect amount");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void transferMoney(PaymentSystem targetAccount, double amount) {
        if (amount <= balance){
            withdrawMoney(amount);
            targetAccount.depositTransfer(amount);
            System.out.printf("Money in the amount of %.2f %s was transferred from %s to the target account = %s", amount, currency, getAccountName(), targetAccount.getAccountName());
        } else {
            System.out.println("No money");
        }
    }
}