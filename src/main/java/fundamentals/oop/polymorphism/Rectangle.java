package fundamentals.oop.polymorphism;


import lombok.Data;

@Data
public class Rectangle extends Shape {

    private double width;
    private double height;
    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
