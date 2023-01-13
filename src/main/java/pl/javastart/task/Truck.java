package pl.javastart.task;

public class Truck extends Car {
    private double cargoWeight;
    private static final double ADD_CONSUMPTION_WITH_AIR_CON = 0.8;
    private static final double ADD_CONSUMPTION_WITH_CARGO = 0.5;
    private static final double WEIGHT_THRESHOLD = 100.0;

    public Truck(String name, double fuelCapacity, double avgConsumption, boolean airCondition, double cargoWeight) {
        super(name, fuelCapacity, avgConsumption, airCondition);
        this.cargoWeight = cargoWeight;
    }

    @Override
    double calcAvgConsumption() {
        double avgConsumption = super.calcAvgConsumption();
        if (isAirCondition()) {
            avgConsumption += ADD_CONSUMPTION_WITH_AIR_CON;
        }
        return avgConsumption + Math.ceil(cargoWeight / WEIGHT_THRESHOLD) * ADD_CONSUMPTION_WITH_CARGO;
    }

    @Override
    double calcRange() {
        return (getFuelCapacity() / calcAvgConsumption()) * 100;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
