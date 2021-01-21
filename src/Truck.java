public class Truck extends Vehicle {
    int carNo;
	public Truck() {
		typeVehicle = "Truck";
		noOfTyres = 6;
		accessories = false;
		brand="Hino";
		counter = counter + 1;
	}
	
	@Override
	public void displayTruckInfo() {
		System.out.println("Type Vehicle\t\t: " + typeVehicle);
		System.out.println("No of Tyres\t\t: " + noOfTyres);
		System.out.println("accessories\t\t: " + accessories);
		System.out.println("Brand\t\t\t: " + brand);
		System.out.println("Number of Vehicles\t: " + counter);		
	}
}
