package Lesson5.PC.GraphicCard;

import Lesson5.PC.Info;

public class GraphicCard implements Info {
    private String cardManufacturer;
    private String typeMemory;
    private String typeCooling;
    private int memorySize;

    public GraphicCard(String cardManufacturer, String typeMemory, String typeCooling, int memorySize) {
        this.cardManufacturer = cardManufacturer;
        this.typeMemory = typeMemory;
        this.typeCooling = typeCooling;
        this.memorySize = memorySize;
    }

    @Override
    public void printInfo() {
        System.out.println("Производитель: " + cardManufacturer);
        System.out.println("Тип памяти: " + typeMemory);
        System.out.println("Объем памяти: " + memorySize);
    }

    public String getCardManufacturer() {
        return cardManufacturer;
    }

    public void setCardManufacturer(String cardManufacturer) {
        this.cardManufacturer = cardManufacturer;
    }

    public String getTypeMemory() {
        return typeMemory;
    }

    public void setTypeMemory(String typeMemory) {
        this.typeMemory = typeMemory;
    }

    public String getTypeCooling() {
        return typeCooling;
    }

    public void setTypeCooling(String typeCooling) {
        this.typeCooling = typeCooling;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
}
