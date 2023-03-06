package fundamentals.oop.abstraction.interfaces;

public interface Vehicle {

    void cleanVehicle();

    @SuppressWarnings("java:S106")
    default void startVehicle() {
        System.out.println("starting");
    }
}
