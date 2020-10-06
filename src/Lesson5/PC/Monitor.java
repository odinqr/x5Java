package Lesson5.PC;

public class Monitor implements Info{
    private String manufacturer;
    private int diagonal;

    public Monitor (String manufacturer, int diagonal) {
        this.manufacturer = manufacturer;
        this.diagonal = diagonal;
    }

    @Override
    public void printInfo() {
        System.out.println("Производитель монитора: " + manufacturer);
        System.out.println("Диагональ экрана: " + diagonal);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
}
