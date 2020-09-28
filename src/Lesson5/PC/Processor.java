package Lesson5.PC;

public class Processor extends PC {
    private int frequency;
    private int coreQuantity;
    private int cash;
    private String title;
    private String manufacturer;

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

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
