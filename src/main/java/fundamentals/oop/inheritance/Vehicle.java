package fundamentals.oop.inheritance;

public class Vehicle {

    private String make;
    private String color;
    private int year;
    private String model;
    private int topSpeed;

    int fuelCapacity = 90;

    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    @SuppressWarnings("java:S106")
    public void printDetails() {
        System.out.println("Manufacturer: " + this.make);
        System.out.println("Color: " + this.color);
        System.out.println("Year: " + this.year);
        System.out.println("Model: " + this.model);
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
