package Lesson4.Car;

public class Lorry extends Car {

    private double cargoWeight;

    public Lorry() {
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void start() {
        System.out.println(getCarBrand() + " поехал");
    }

    @Override
    public void stop() {
        System.out.println(getCarBrand() + " остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Марка: " + getCarBrand());
        System.out.println("Класс: " + getCarClass());
        System.out.println("Масса автомобиля: " + getCarWeight() + " кг.");
        System.out.println("Грузоподъемность: " + getCargoWeight() + " кг.");
    }

}