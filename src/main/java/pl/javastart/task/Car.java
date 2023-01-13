package pl.javastart.task;

public class Car extends Vehicle {
    private boolean airCondition = false;
    private static final double ADD_CONSUMPTION_WITH_AIR_CON = 0.8;

    public Car(String name, double fuelCapacity, double avgConsumption, boolean airCondition) {
        super(name, fuelCapacity, avgConsumption);
        this.airCondition = airCondition;
    }

    @Override
    double calcAvgConsumption() {
        double avgConsumption;
        if (airCondition) {
            avgConsumption = getAvgConsumption() + ADD_CONSUMPTION_WITH_AIR_CON;
        } else {
            avgConsumption = getAvgConsumption();
        }
        return avgConsumption;
    }

    @Override
    double calcRange() {
        return (getFuelCapacity() / calcAvgConsumption()) * 100;
    }

    @Override
    public boolean isAirCondition() {
        return airCondition;
    }

    @Override
    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }
}
