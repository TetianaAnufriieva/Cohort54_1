package homework_25.gadgets;

public abstract class Gadget implements Repairable {

    protected String ownerName; // имя владельца гаджета.
    protected String model; // модель устройства.
    protected double repairCost; // стоимость ремонта.

    public Gadget(String ownerName, String model, double repairCost) {
        this.ownerName = ownerName;
        this.model = model;
        this.repairCost = repairCost;
    }

    @Override
    public double getRepairCost() {
        return repairCost;
    }

    public String getModel() {
        return model;
    }
}
