package methodoverriding;

class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Car is Starting...");
	}
	@Override
	void stop() {
		System.out.println("Car is stop!!!");
	}
}

class Bike extends Vehicle{
	@Override
	void start() {
		System.out.println("Bike is Starting...");
	}
	@Override
	void stop() {
		System.out.println("Bike is stop!!!");
	}
}

public class VehicleHierarchyMethodOverriding {
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		car.start();
		car.stop();
		bike.start();
		bike.stop();
	}
}
