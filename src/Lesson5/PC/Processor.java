package Lesson5.PC;

public class Processor implements Info{
    private int frequency;
    private int coreQuantity;
    private int cashMemory;
    private String manufacturer;
    private String title;

    public Processor (int frequency, int coreQuantity, int cashMemory, String manufacturer, String title) {
        this.frequency = frequency;
        this.coreQuantity = coreQuantity;
        this.cashMemory = cashMemory;
        this.manufacturer = manufacturer;
        this.title = title;
    }

    @Override
    public void printInfo() {
        System.out.println("Характеристики процессора: ");
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Модель: " + title);
        System.out.println("Частота: " + frequency);
        System.out.println("Количество ядер: " + coreQuantity);
        System.out.println("Объем кэш-памяти: " + cashMemory);
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCoreQuantity() {
        return coreQuantity;
    }

    public void setCoreQuantity(int coreQuantity) {
        this.coreQuantity = coreQuantity;
    }

    public int getCashMemory() {
        return cashMemory;
    }

    public void setCashMemory(int cashMemory) {
        this.cashMemory = cashMemory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
