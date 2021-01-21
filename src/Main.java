public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.displayCarInfo();
        vehicle = new Truck();
        vehicle.displayTruckInfo();
    }
}
