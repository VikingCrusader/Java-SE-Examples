import java.util.*;

public class Bus_Station_Management_System {
    public static void main(String[] args) {
        Driver d1 = new Driver("老刘","19880615");
        Buses b1 = new Buses("Mercedes",d1);
        Passenger p1 = new Passenger("小王",20020712);
        Passenger p2 = new Passenger("小李",19970820);
        Passenger p3 = new Passenger("赵大姐",19720415);
        b1.addPassenger(p1);
        b1.addPassenger(p2);
        b1.addPassenger(p3);
        b1.speak();
    }
}

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void speak() {
        System.out.println(this.name + " is a Person");
    }
}

class Driver extends Person {
    private String licenseID;

    Driver(String name, String licenseID) {
        super(name);
        this.licenseID = licenseID;
    }

    @Override
    void speak() {
        System.out.println(getName() + " is a driver with license ID: " + licenseID);
    }
}

class Passenger extends Person {
    private int ticketNumber;

    Passenger(String name, int ticketNumber) {
        super(name);
        this.ticketNumber = ticketNumber;
    }

    void speak() {
        System.out.println(getName() + " is a passenger with ticked number: " + ticketNumber);
    }
}

class Buses {
    private String model;
    private Driver driver;
    ArrayList<Passenger> passengers = new ArrayList<>();

    Buses(String model, Driver driver) {
        this.model = model;
        this.driver = driver;
    }

    void addPassenger(Passenger p) {
        passengers.add(p);
    }

    void speak() {
        System.out.println("The model of the bus is:" + model);
        driver.speak();
        System.out.println("Passengers:");
        for (Passenger p : passengers) {
            p.speak();
        }
    }
}