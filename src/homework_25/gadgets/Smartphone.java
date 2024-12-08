package homework_25.gadgets;

public class Smartphone extends Gadget implements Repairable{

    public Smartphone(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }

    @Override
    public void diagnose() {
        System.out.println("Диагностика устройства: " + model + " владельца " + ownerName + ".");
        System.out.println("Проверка экрана и батареи");

    }

    @Override
    public void repair() {
        System.out.println("Ремонт начат");
        System.out.println("Замена экрана завершена");
    }

    @Override
    public double estimateRepairTime() {
        return 2.5;
    }
}
