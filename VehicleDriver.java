package methodOverriding;

// 2. In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes. 

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		Vehicle carVehicle=new CarVehicle();
		Vehicle bikeVehicle=new BikeVehicle();
		
		vehicle.start();
		vehicle.stop();
		carVehicle.start();
		carVehicle.stop();
		bikeVehicle.start();
		bikeVehicle.stop();
	}
}

class Vehicle{
	
	public void start() {
		System.out.println("Vehicle is Starting");
	}
	
	public void stop() {
		System.out.println("Vehicle is Stoping");
	}
	
}

class CarVehicle extends Vehicle{
	
	public void start() {
		System.out.println("Car is Starting");
	}
	
	public void stop() {
		System.out.println("Car is Stoping");
	}
	
}

class BikeVehicle extends Vehicle{
	
	public void start() {
		System.out.println("Bike is Starting");
	}
	
	public void stop() {
		System.out.println("Bike is Stoping");
	}
	
}
