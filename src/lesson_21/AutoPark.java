package lesson_21;

public class AutoPark {
    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "LN-4515");
        Autobus bus = new Autobus(busDriver, 15);

        System.out.println(bus.toString());

        BusDriver peter = new BusDriver("Peter", "LN-5515");

        bus.setDriver(peter);

        System.out.println(bus.toString());
        System.out.println(busDriver.toString());

        System.out.println("\n-------\n");
        BusDriver margo = new BusDriver("Margo", "LN-1546");
        Autobus bus1 = new Autobus(margo, 24);

        System.out.println(bus1.toString());

        bus1.installNewAutopilot("AP-gpt6");
        System.out.println(bus1.toString());

        margo.setName("Margo-Susana");
        System.out.println(bus1.toString());

        bus1 = null;
        System.out.println(margo.toString());

        System.out.println(bus.toString());
        bus.setDriver(margo);
        System.out.println(bus.toString());

        System.out.println("\n-----\n");
        Passenger p1 = new Passenger("Alex");
        Passenger p2 = new Passenger("Max");
        Passenger p3 = new Passenger("Tom");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println("\n****takePassenger*****\n");
        bus.takePassenger(p1);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.takePassenger(p2);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.takePassenger(p3);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.takePassenger(p1);
        System.out.println("count pass: " + bus.getCountPassengers());

        System.out.println("\n****dropPassenger*****\n");
        bus.dropPassenger(p1);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.dropPassenger(p2);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.dropPassenger(p3);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.dropPassenger(p1);
        System.out.println("count pass: " + bus.getCountPassengers());


    }
}
