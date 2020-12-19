package JavaMasterClass2020;

public class Car {

    private String name;
    private boolean engine;
    private int numberOfCylinders;
    private int wheels;

    public Car(String name, int numberOfCylinders) {
        this.name = name;
        this.engine = true;
        this.numberOfCylinders = numberOfCylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return "Car: startEngine";
    }

    public String accelerate() {
        return "Car: accelerate";
    }

    public String brake() {
        return "Car: brake";
    }

}
