package Lesson5.PC;

public class DiscDrive implements Info{
    private String manufacturer;
    private int memory;
    private String type;
    private float formFactor;

    public DiscDrive (String manufacturer, String type, int memory, float formFactor) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.memory = memory;
        this.formFactor = formFactor;
    }

    @Override
    public void printInfo() {
        System.out.println("Производитель HDD: " + manufacturer);
        System.out.println("Тип жесткого диска: " + type);
        System.out.println("Объем кэш-памяти: " + memory);
        System.out.println("Форм-фактор: " + formFactor);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(float formFactor) {
        this.formFactor = formFactor;
    }
}
