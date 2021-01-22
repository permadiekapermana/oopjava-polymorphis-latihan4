public class Car extends Vehicle {

	int carNo;
	public Car() {
		this.typeVehicle = "Car";
		this.noOfTyres = 4;
		this.accessories = switchOn();
		this.brand="Toyota";
		counter = counter + 1;
	}

}