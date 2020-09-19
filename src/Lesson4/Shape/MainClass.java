package Lesson4.Shape;

public class MainClass {

    public static void main(String[] args) {

        Shape[] shape = new Shape[3];
        shape[0] = new Circle(11);
        shape[1] = new Triangle(15, 8);
        shape[2] = new Rectangle(28, 13);

        for (Shape sh:shape) {
            System.out.println("Площадь фигуры: " + sh.getSquare());
        }
    }
}
