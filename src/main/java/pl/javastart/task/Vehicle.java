package pl.javastart.task;

public abstract class Vehicle {
    private String name;
    private double fuelCapacity;
    private double avgConsumption;

    public Vehicle(String name, double fuelCapacity, double avgConsumption) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.avgConsumption = avgConsumption;
    }

    double calcAvgConsumption() {
        return avgConsumption;
    }

    double calcRange() {
        return fuelCapacity / avgConsumption;
    }

    abstract boolean isAirCondition();

    abstract void setAirCondition(boolean airCondition);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getAvgConsumption() {
        return avgConsumption;
    }

    public void setAvgConsumption(double avgConsumption) {
        this.avgConsumption = avgConsumption;
    }
}
