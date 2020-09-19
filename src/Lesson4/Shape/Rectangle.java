package Lesson4.Shape;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle (double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public double getSquare() {
        return this.width * this.height;
    }
}
