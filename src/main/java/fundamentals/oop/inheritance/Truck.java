package fundamentals.oop.inheritance;


// Direct Inheritance (First Level)
@SuppressWarnings("java:S106")
public class Truck extends Vehicle {

    private String bodyStyle;
    private int fuelCapacity = 200;

    public Truck(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);
        this.bodyStyle = bodyStyle;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Body Style: " + bodyStyle);
    }

    public void openTailgate() {
        System.out.println("Tailgate is open");
    }

    public void displayFuelCapacity() {
        System.out.println("Fuel Capacity from the Vehicle class: " + super.fuelCapacity);
        System.out.println("Fuel Capacity from the Truck Class: " + this.fuelCapacity);
    }
}
