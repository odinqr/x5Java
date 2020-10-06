package Lesson5.PC.GraphicCard;

public class StandartCoolingStrategy implements CoolingStrategy {
    @Override
    public void cooling() {
        System.out.println("На этой видеокарте используется стандартное воздушное охлаждение.");
    }
}
