package homework_24.task_02;

public interface PaymentSystem {

    void withdrawMoney(double amount); // снятие со счета - списываются деньги со счета
    void depositTransfer(double amount); // поступление денег на счет
    double checkBalance(); // остаток на счете
    void transferMoney(PaymentSystem targetAccount, double amount); // перевод средств на другой счет
}
