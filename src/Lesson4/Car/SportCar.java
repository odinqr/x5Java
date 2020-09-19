package Lesson4.Car;

public class SportCar extends Car {

    private int maxSpeed;

    public SportCar() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
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
        System.out.println("Максимальная скорость: " + getMaxSpeed() + " км/ч.");
    }
}