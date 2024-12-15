package homework_27.task_01;

public enum WeatherSeason {

    WINTER (0),
    SPRING (10),
    SUMMER (25),
    AUTUMN (15);

    private double averageTemp;

    WeatherSeason(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public double getAverageTemp() {
        return averageTemp;
    }

    public void setAverageTemp(double averageTemp) {
        this.averageTemp = averageTemp;
    }

}
