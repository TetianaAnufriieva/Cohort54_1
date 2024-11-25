package lesson_21;

import java.util.Arrays;

public class Autobus {
    private static int counter;
    private final int id;

    private BusDriver driver; // агрегация (мягкая связь)
    private Autopilot autopilot; // композиция (жесткая и неразрывная связь)

    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus (BusDriver busDriver, int capacity){
        this.id = counter++;
        this.driver = busDriver;
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-V001");
        this.autopilot.setAutobus(this);
        this.passengers = new Passenger[capacity];
    }

    public boolean takePassenger(Passenger passenger) {
         if (countPassengers < capacity) {
            if (isPassengerInBus(passenger)) {
                // такой пас есть в списке
                System.out.printf("Пассажир id: %d уже в автобусе с id %d\n", passenger.getId(), this.id);
                return false;
            }

            // Садим на борт
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир id: %d завершил посадку в автобус с id %d\n", passenger.getId(), this.id);
            return true;
        }

        // Свободного места нет
        System.out.printf("В автобусе id: %d свободных мест нет!\n", this.id);
        return false;
    }

    // TODO написать метод высадки пассажира из автобуса
     /*
    Проверить есть ли пассажир в автобусе.
    Убрать его из списка пассажиров
    [ 1, 2, 6, 78, 99] -> убрать с id 6 [1, 2, 78, 99]
    Уменьшить кол-во пассажиров
     */
    public boolean dropPassenger(Passenger passenger){
       if (!isPassengerInBus(passenger)){
           System.out.printf("Пассажира с таким id = %d в автобусе с id = %d не сущесвует\n", passenger.getId(), this.id);
           return false;
       }

       int passengerToDropFound = 0;

       for(int i = 0; i < countPassengers - 1; i++){
           if (passengers[i].getId() == passenger.getId()) {
               passengerToDropFound = 1;
           }

           passengers[i] = passengers[i + passengerToDropFound];
       }

       passengers[countPassengers - 1] = null;

       countPassengers--;
       System.out.printf("Пассажир с id = %d был высажен из автобуса с id = %d\n", passenger.getId(), this.id);
       System.out.println(Arrays.toString(passengers));

        return true;
    }


    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }
        // пассажира с таким id нет в нашем массиве пассажиров
        return false;
    }

    public void updateAutopilot(String softwareVersion){
        this.autopilot.setSoftwareVersion(softwareVersion);

    }

    public void installNewAutopilot(String softwareVersion){
        this.autopilot.setAutobus(null);
        this.autopilot = new Autopilot(softwareVersion);
        this.autopilot.setAutobus(this);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ("Autobus: {");
        sb.append("id: ").append(id);
        sb.append(", capacity: ").append(capacity);
        sb.append(", ").append(driver.toString());
        sb.append(", ").append(autopilot.toString());
        sb.append("}");
        return sb.toString();

//        return "Autobus: {" +
//                "id=" + id + ", capacity=" + capacity +
//                ", driver=" + driver.toString() +
//                ", autopilot=" + autopilot.toString() +
//                '}';
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {

        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
