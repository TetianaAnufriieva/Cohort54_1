package lesson_27.enums.days;

public enum Day {


    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY ("Среда", 3),
    THURSDAY ("Четверг", 4),
    FRIDAY ("Пятница", 5),
    SATURDAY ("Суббота", 6),
    SUNDAY ("Воскресенье");

    private String russianName;
    private int dayNumber;

    public String testMethod() {
        return String.format("%s - русский перевод: %s; номер дня недели: %d",
                this.name(), this.russianName, this.dayNumber);
    }

    Day(String russianName, int dayNumber) {
        this.russianName = russianName;
        this.dayNumber = dayNumber;
    }

    // "Конструктор" может быть перегружен
    Day(String russianName) {
        this.russianName = russianName;
        this.dayNumber = 7;
    }

    public String getRussianName() {
        return russianName;
    }

    public void setRussianName(String russianName) {
        this.russianName = russianName;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }
}


