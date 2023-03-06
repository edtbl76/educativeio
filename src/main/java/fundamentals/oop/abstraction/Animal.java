package fundamentals.oop.abstraction;

// abstract class
@SuppressWarnings("java:S1610")
public abstract class Animal {

    // abstract method
    public abstract void makeSound();

    @SuppressWarnings("java:S106")
    public void move() {
        System.out.println(getClass().getSimpleName() + " is moving");
    }
}
