package homework_20.Task2;

public class Tea extends Beverage {
    private String teaType;
    private boolean hasLemon;

    public Tea(String name, double volume, double temperature, String teaType, boolean hasLemon) {
        super(name, volume, temperature);
        this.teaType = teaType;
        this.hasLemon = hasLemon;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }

    public void setHasLemon(boolean hasLemon) {
        this.hasLemon = hasLemon;
    }

    public String getTeaType() {
        return teaType;
    }

    public boolean isHasLemon() {
        return hasLemon;
    }


    public void addLemon() {
        if (!hasLemon) {
            hasLemon = true;
           System.out.println("Добавить лимон");
        } else {
            hasLemon = false;
            System.out.println("Лимон добавили");
        }
    }
}