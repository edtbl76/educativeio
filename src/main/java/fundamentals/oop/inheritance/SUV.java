package fundamentals.oop.inheritance;

// Direct Inheritance from Vehicle
// However, this is a sibling of Truck,
// which demonstrates Hierarchical / Parallel inheritance
public class SUV extends Vehicle {

    int fuelCapacity = 50;
    public SUV(String make, String color, int year, String model) {
        super(make, color, year, model);
    }

    @SuppressWarnings("java:S106")
    public void displayFuelCapacity() {
        System.out.println("Fuel Capacity from the Vehicle class: " + super.fuelCapacity);
        System.out.println("Fuel Capacity from the SUV Class: " + this.fuelCapacity);
    }
}
