package ganesh1;
class Vehicle{
	String brand;
	String model;
	public Vehicle(String brand,String model){
		this.brand = brand;
		this.model = model;
	}
	void displayInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
	}
}
class Car extends Vehicle{
	String fueltype;
	public Car (String brand,String model,String fueltype) {
		super(brand,model);
		this.fueltype = fueltype;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Fuel: " + fueltype);
	}
}
class ElectricCar extends Car{
	double batteryCapacity;
	public ElectricCar(String brand,String model,String fueltype,double batteryCapacity){
	super(brand,model,fueltype);
	this.batteryCapacity = batteryCapacity;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Battery Capacity: " + batteryCapacity);
	}
}
public class VehicleDetails {
	public static void main(String[] args) {
		ElectricCar electric = new ElectricCar("Tesla","S","Petrol",400);
		electric.displayInfo();
	}
}
