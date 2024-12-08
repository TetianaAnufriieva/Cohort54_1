package homework_25.gadgets;

public class Laptop extends Gadget implements Repairable{

    public Laptop(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }

    @Override
    public void diagnose() {
        System.out.println("Диагностика устройства: " + model + " владельца " + ownerName);
        System.out.println("Проверка состояния жесткого диска и системы охлаждения");

    }

    @Override
    public void repair() {
        System.out.println("Ремонт начат");
        System.out.println("Замена кулера завершена");
    }

    @Override
    public double estimateRepairTime() {
        return 3;
    }
}
