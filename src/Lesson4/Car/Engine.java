package Lesson4.Car;

public class Engine {
    private int power;
    private String manufacturer;

    public Engine() {

    }
    public Engine(String manufacturer, int power) {
        this.manufacturer = manufacturer;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void enginePrintInfo() {
        System.out.println("Производитель двигателя: " + getManufacturer());
        System.out.println("Мощность двигателя: " + getPower() + " л.с.");
    }

}
