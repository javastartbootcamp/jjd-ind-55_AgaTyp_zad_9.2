package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        VehicleFleet vehicles = new VehicleFleet();

        vehicles.addVehicle(new Car("Ford Escort", 32.0, 12.0, false));
        vehicles.addVehicle(new Car("Ford Focus", 40.0, 6.0, false));
        vehicles.addVehicle(new Truck("Star", 100.0, 23.0, false, 201));
        vehicles.addVehicle(new Truck("Iveco", 80.0, 14.0, false, 101));

        vehicles.getInfo();

        vehicles.turnOnAirConditionAllVehicles();

        vehicles.getInfo();
    }
}
