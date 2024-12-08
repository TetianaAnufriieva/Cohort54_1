package homework_24.task_02_fromTeacher.optionalTask_02;

public class BtcWallet extends VusaMember{

    public BtcWallet(String title, double balance) {
        super(title, balance, "BTC");
    }

    @Override
    public String toString() {
        return "BtcWallet: {" + "title=" + title
                + ", balance=" + balance
                + ", currency: " + getCurrency() +
                '}';
    }

    @Override
    public boolean transferMoney(double amountBtc, PaymentSystem recipient) {
        if (amountBtc > balance) {
            System.out.printf("Недостаточно средств: (transfer: %.2f | balance: %.2f)\n)",
                    amountBtc, balance);
            return false;
        }

        if (recipient.getCurrency().equals("BTC")) {
            // Перевод Btc -> Btc
            balance -= amountBtc;
            recipient.depositTransfer(amountBtc);
            System.out.printf("Успех! Перевод %.2f BTC (%s -> %s)\n",
                    amountBtc, title, recipient.getTitle());
            return true;
        } else if (recipient.getCurrency().equals("EUR")) {
            // Конвертировать Btc -> Eur
            System.out.println("Курс: " + getCourseBTC());
            double amountEur = amountBtc * getCourseBTC();
            balance -= amountBtc;
            recipient.depositTransfer(amountEur);

            System.out.printf("Успех! Перевод %.7f BTC в %.2f EUR (%s -> %s)\n",
                    amountBtc,  amountEur, title, recipient.getTitle());
            return true;
        }

        System.out.println("Что-то пошло не так с валютой счета получателя");
        return false;
    }
}

