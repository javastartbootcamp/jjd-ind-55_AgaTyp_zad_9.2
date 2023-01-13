package pl.javastart.task;

import java.util.Arrays;

public class VehicleFleet {
    private Vehicle[] vehicles = new Vehicle[10];
    private int vehiclesNo = 0;

    public void getInfo() {
        for (int i = 0; i < vehiclesNo; i++) {
            Vehicle vehicle = vehicles[i];
            System.out.printf("Samochód: %s, pojemność baku: %.2f, klimatyzacja: %s, średnie spalanie: %.2f\n",
                    vehicle.getName(), vehicle.getFuelCapacity(), vehicle.isAirCondition(), vehicle.calcAvgConsumption());
            System.out.printf("Zasięg na pełnym baku: %.2f\n", vehicle.calcRange());

        }
        System.out.printf("==================\n");

    }

    public void addVehicle(Vehicle vehicle) {
        if (vehiclesNo >= vehicles.length) {
            vehicles = Arrays.copyOf(vehicles, vehicles.length * 2);
        }
        if (vehiclesNo < vehicles.length) {
            vehicles[vehiclesNo] = vehicle;
            vehiclesNo++;
        }
    }

    private void turnOnAirCondition(Vehicle vehicle) {
        vehicle.setAirCondition(true);
    }

    private void turnOffAirCondition(Vehicle vehicle) {
        vehicle.setAirCondition(false);
    }

    public void turnOnAirConditionAllVehicles() {
        for (int i = 0; i < vehiclesNo; i++) {
            turnOnAirCondition(vehicles[i]);
        }
    }
}
