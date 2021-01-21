public class Car extends Vehicle {

	int carNo;
	public Car() {
		typeVehicle = "Car";
		noOfTyres = 4;
		accessories = true;
		brand="Toyota";
		counter = counter + 1;
	}
	
	@Override
	public void displayCarInfo() {
		System.out.println("Type Vehicle\t\t: " + typeVehicle);
		System.out.println("No of Tyres\t\t: " + noOfTyres);
		System.out.println("accessories\t\t: " + accessories);
		System.out.println("Brand\t\t\t: " + brand);
		System.out.println("Number of Vehicles\t: " + counter);		
	}

}