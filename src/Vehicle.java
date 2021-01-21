public class Vehicle {
    Vehicle() {
        
    }
    public String typeVehicle;
    public int noOfTyres;
    public boolean accessories;
    public String brand;
    public int counter;
    public String toyota;
   
   public Vehicle(int noOfTyres, String brand, boolean accessories, int counter, String toyota, String typeVehicle) {
       noOfTyres = 5;
       accessories = true;
       brand = toyota;
       counter = counter + 1;       
   }
   
   public boolean switchOn() {
       return true;
   }
   public boolean switchOff() {
       return false;
   }
   public boolean isPresent() {
       return true;
   }
   public boolean getBrand() {
       return true;
   }
   public static boolean getNoOfVehicles() {
       return true;
   }

   public void displayCarInfo() {
   }

   public void displayTruckInfo() {
    }
}
