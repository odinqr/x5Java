package Lesson5.PC.GraphicCard;

public class GeforceFactory extends StandartCoolingStrategy{
    public GraphicCard createGraphicCard() {
        GraphicCard geforce = new GraphicCard("Nvidia", "GDDR", "StandartCooling", 2048) {
        };
        return geforce;
    }

    @Override
    public void cooling() {
        super.cooling();
    }
}
