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
Опционально
Добавить в интерфейс метод:
transferMoney() (перевод средств на другой счет) - Средства списываются с одного счета и зачисляются на другой счет
Должна быть возможность осуществлять переводы между этими классами. Т.е. возможность перевода средств:
Банк -> Банк
Банк -> Кошелек
Кошелек -> Кошелек
Кошелек -> Банк
 */

package homework_24.task_02;

public class Main {

    public static void main(String[] args) {

    BankAccount bankAccount1 = new BankAccount(1000,"EU", "Bank1");
    BankAccount bankAccount2 = new BankAccount(2000,"EU", "Bank2");
    ElectronicWallet electronicWallet1 = new ElectronicWallet(1200, "EU","EWall1");
    ElectronicWallet electronicWallet2 = new ElectronicWallet(2200, "EU","EWall2");

    System.out.println("**********bankAccount***********");
    System.out.println("Balance " + bankAccount1.checkBalance());
    bankAccount1.depositTransfer(300);
    bankAccount1.withdrawMoney(100);
    System.out.println("Balance " + bankAccount1.checkBalance());

    System.out.println("\n**********electronicWallet***********");
    System.out.println("Balance " + electronicWallet1.checkBalance());
    electronicWallet1.depositTransfer(450);
    electronicWallet1.withdrawMoney(150);
    System.out.println("Balance = " + electronicWallet1.checkBalance());

    System.out.println("\n**********Bank -> EWallet***********");
    System.out.println("Balance Bank1= " + bankAccount1.checkBalance());
    System.out.println("Balance EWallet1= " + electronicWallet1.checkBalance());
    bankAccount1.transferMoney(electronicWallet1, 50);
    System.out.println("\nBalance Bank1= " + bankAccount1.checkBalance());
    System.out.println("Balance EWallet1= " + electronicWallet1.checkBalance());

    System.out.println("\n**********Bank -> Bank***********");
    System.out.println("Balance Bank1= " + bankAccount1.checkBalance());
    System.out.println("Balance Bank2= " + bankAccount2.checkBalance());
    bankAccount1.transferMoney(bankAccount2, 50);
    System.out.println("\nBalance Bank1= " + bankAccount1.checkBalance());
    System.out.println("Balance Bank2= " + bankAccount2.checkBalance());

    }
}
