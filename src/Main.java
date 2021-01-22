public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.displayVehicleInfo();
        System.out.println();
        vehicle = new Truck();
        vehicle.displayVehicleInfo();
    }
}
