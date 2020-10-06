package Lesson5.PC.GraphicCard;

public class RadeonFactory extends WaterCoolingStrategy{
    public GraphicCard createGraphicCard() {
        GraphicCard radeon = new GraphicCard("AMD", "GDDR", "WaterCooling", 2048);
        return radeon;
    }

    @Override
    public void cooling() {
        super.cooling();
    }
}
