package Lesson5.PC;

public class SSDFactory {
    public DiscDrive createSSD() {
        DiscDrive kingston = new DiscDrive("Kingston", "SSD", 4096, 3.5f);
        return kingston;
    }
}
