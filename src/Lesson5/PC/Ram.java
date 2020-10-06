package Lesson5.PC;

public class Ram implements Info{
    private String manufacturer;
    private int memorySize;

    public Ram (String manufacturer, int memorySize) {
        this.manufacturer = manufacturer;
        this.memorySize = memorySize;
    }

    @Override
    public void printInfo() {
        System.out.println("Производитель памяти: " + manufacturer);
        System.out.println("Объем памяти: " + memorySize);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
}
