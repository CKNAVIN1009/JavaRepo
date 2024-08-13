package Assessment1;

abstract class ElectronicDevice {
 private String brand;
 private String model;

 // Constructor
 public ElectronicDevice(String brand, String model) {
     this.brand = brand;
     this.model = model;
 }

 // Abstract method
 public abstract void turnOn();

 // Regular method
 public void displayInfo() {
     System.out.println("Brand: " + brand);
     System.out.println("Model: " + model);
 }
}

//Interface representing smart device features
interface SmartDevice {
 void connectToInternet();
}

class Smartphone extends ElectronicDevice implements SmartDevice {
 private String operatingSystem;

 // Constructor
 public Smartphone(String brand, String model, String operatingSystem) {
     super(brand, model);
     this.operatingSystem = operatingSystem;
 }

 public void turnOn() {
     System.out.println("Smartphone is turning on...");
 }


 public void connectToInternet() {
     System.out.println("Smartphone is connecting to the internet...");
 }

 public void displayInfo() {
     super.displayInfo();
     System.out.println("Operating System: " + operatingSystem);
 }
}

class SmartWatch extends ElectronicDevice implements SmartDevice {

 // Constructor
 public SmartWatch(String brand, String model) {
     super(brand, model);
 }

 public void turnOn() {
     System.out.println("Smartwatch is turning on...");
 }


 public void connectToInternet() {
     System.out.println("Smartwatch is connecting to the internet...");
 }



}

//Test class to demonstrate the use of abstraction and interface
public class Abstraction {
 public static void main(String[] args) {
     // Create instances of Smartphone and SmartWatch
     ElectronicDevice myPhone = new Smartphone("Apple", "iPhone 14", "iOS");
     ElectronicDevice myWatch = new SmartWatch("Samsung", "Galaxy Watch 6");

     System.out.println("Smartphone Details:");
     myPhone.displayInfo();
     myPhone.turnOn();
     System.out.println("\nSmartwatch Details:");
     myWatch.displayInfo();
     myWatch.turnOn();
     
 }
}

	        




