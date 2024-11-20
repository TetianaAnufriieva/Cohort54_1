package homework_20.Task2;

public class Beverage {
    private String name;
    private double volume;
    private double temperature;

    public Beverage(String name, double volume, double temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public String toString(){
        return "Название напитка: " + name + "\nОбъем напитка в мм: " + volume + "\nТемпература напитка в С: " + temperature;
    }

}
