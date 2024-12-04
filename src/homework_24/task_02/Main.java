/*
Task 2
Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */

package homework_24.task_02;

public class Main {

    public static void main(String[] args) {

    BankAccount bankAccount = new BankAccount(110);
    ElectronicWallet electronicWallet = new ElectronicWallet(120, "USD");

    bankAccount.depositTransfer(300);
    bankAccount.withdrawMoney(100);
    System.out.println(bankAccount.checkBalance());

    System.out.println("*********************\n");

    electronicWallet.depositTransfer(450);
    electronicWallet.withdrawMoney(150);
    System.out.println(electronicWallet.checkBalance());

    }
}
