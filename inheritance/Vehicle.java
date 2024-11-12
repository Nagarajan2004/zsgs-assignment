package inheritance;

public abstract class Vehicle {
    private String fuelType;
    private String model;
    private String color;
    private int numberOfSeats;
    private int maxSpeed;
    private int mileage;

    public Vehicle(String fuelType, String model, String color, int numberOfSeats, int maxSpeed, int mileage) {
        this.fuelType = fuelType;
        this.model = model;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Color: " + color);
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Mileage: " + mileage + " km/l");
    }
}