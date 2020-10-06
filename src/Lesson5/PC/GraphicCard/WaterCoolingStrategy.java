package Lesson5.PC.GraphicCard;

public class WaterCoolingStrategy implements CoolingStrategy {
    @Override
    public void cooling() {
        System.out.println("На этой карте установлено жидкостное охлаждение");
    }
}
