package inheritance;

class Car extends Vehicle {
    public Car(String fuelType, String model, String color, int numberOfSeats, int maxSpeed, int mileage) {
        super(fuelType, model, color, numberOfSeats, maxSpeed, mileage);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Details:");
        super.displayInfo();
    }
}

class Bike extends Vehicle {
    public Bike(String fuelType, String model, String color, int numberOfSeats, int maxSpeed, int mileage) {
        super(fuelType, model, color, numberOfSeats, maxSpeed, mileage);
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike Details:");
        super.displayInfo();
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Car car = new Car("Petrol", "Toyota Camry", "White", 5, 240, 15);
        Bike bike = new Bike("Petrol", "Yamaha MT-15", "Black", 2, 130, 40);
        car.displayInfo();
        System.out.println();
        bike.displayInfo();
    }
}
