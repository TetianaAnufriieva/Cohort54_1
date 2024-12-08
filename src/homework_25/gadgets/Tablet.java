package homework_25.gadgets;

public class Tablet extends Gadget implements Repairable{

    public Tablet(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }

    @Override
    public void diagnose() {
        System.out.println("Диагностика устройства: " + model + " владельца " + ownerName);
        System.out.println("Проверка состояния экрана и сенсора  на наличие трещин, мерцаний");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт начат");
        System.out.println("Замена  дисплейного модуля, включая сенсорное стекло, завершена");
    }

    @Override
    public double estimateRepairTime() {
        return 4;
    }
}
