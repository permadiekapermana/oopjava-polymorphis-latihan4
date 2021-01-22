public class Vehicle {
    
    String typeVehicle;
    int noOfTyres;
    boolean accessories;
    String brand;
    static int counter;
   
   public Vehicle() {
       this.noOfTyres = 5;
       this.accessories = true;
       this.brand = "toyota";     
   }
   
   public boolean switchOn() {
       return this.accessories = true;
   }
   public boolean switchOff() {
       return this.accessories = false;
   }
   public boolean isPresent() {
       return this.accessories;
   }
   public void getBrand() {
       System.out.println(this.brand);
   }
   static void getNoOfVehicles() {
       System.out.println(counter);
   }

   public void displayVehicleInfo() {
        System.out.println("Car No.\t\t\t: " + counter);
        System.out.println("Type Vehicle\t\t: " + this.typeVehicle);		
        System.out.println("No of Tyres\t\t: " + this.noOfTyres);
        System.out.println("accessories\t\t: " + isPresent());
        System.out.println("Brand\t\t\t: " + this.brand);
        System.out.println("Number of Vehicles\t: " + counter);	
   }

}
