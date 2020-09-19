package Lesson4.Shape;

public class Circle implements Shape {

    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double getSquare() {
        return Math.PI * this.radius * this.radius;
    }
}
