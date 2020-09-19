package Lesson4.Shape;

public class Triangle implements Shape {

    private double height; //высота
    private double base; //сторона, на которую опущена высота

    public Triangle (double b, double h) {
        this.base = b;
        this.height = h;
    }
    @Override
    public double getSquare() {
        return (this.base * this.height) / 2;
    }
}
