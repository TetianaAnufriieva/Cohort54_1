package homework_25.gadgets;

public interface Repairable {

    void diagnose(); // провести диагностику устройства.
    void repair(); // выполнить ремонт устройства.
    double getRepairCost(); // получить стоимость ремонта.
    double estimateRepairTime(); // получить время ремонта в зависимости от сложности устройства
}
