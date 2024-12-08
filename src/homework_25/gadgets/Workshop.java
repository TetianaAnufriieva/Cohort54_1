package homework_25.gadgets;

public class Workshop{

    public Workshop() {
    }

    public void processRepair(Gadget gadget){
        gadget.diagnose();
        gadget.repair();
        System.out.println("Время ремонта: " + gadget.estimateRepairTime() + " ч");
        System.out.println("Стоимость ремонта: " + gadget.getRepairCost() + " EU\n");
    }
}
