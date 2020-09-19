package Lesson4.Car;

public class MainClass {
    public static void main(String[] args) {

        // Создаем спортивный автомобиль и его двигатель
        Engine sportCarEngine = new Engine();
        sportCarEngine.setManufacturer("Ferrari");
        sportCarEngine.setPower(415);

        SportCar Ferrari = new SportCar();
        Ferrari.setCarBrand("Ferrari");
        Ferrari.setCarClass("Спортивный автомобиль");
        Ferrari.setCarWeight(1550);
        Ferrari.setMaxSpeed(415);

        // Создаем грузовой автомобиль и его двигатель
        Engine lorryEngine = new Engine();
        lorryEngine.setManufacturer("Ford");
        lorryEngine.setPower(243);

        Lorry Ford = new Lorry();
        Ford.setCarBrand("Ford");
        Ford.setCarClass("Грузовой автомобиль");
        Ford.setCarWeight(4150);
        Ford.setCargoWeight(15000);

        // Вывод информации о спортивном автомобиле
        Ferrari.printInfo();
        sportCarEngine.enginePrintInfo();

        // Вывод информации о грузовом автомобиле
        Ford.printInfo();
        lorryEngine.enginePrintInfo();

        // Реализуем методы поездки для спортивного автомобиля
        Ferrari.start();
        Ferrari.turnLeft();
        Ferrari.turnRight();
        Ferrari.stop();

        // Реализуем методы движения для грузового автомобиля
        Ford.start();
        Ford.turnRight();
        Ford.turnLeft();
        Ford.stop();
    }
}
