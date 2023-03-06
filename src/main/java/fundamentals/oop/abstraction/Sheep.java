package fundamentals.oop.abstraction;

public class Sheep extends Animal {

    @SuppressWarnings("java:S106")
    @Override
    public void makeSound() {
        System.out.println("Baa baa");
    }
}
