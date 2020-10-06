package Lesson5.PC;

public class HDDFactory {
    public DiscDrive createHDD() {
        DiscDrive seagate = new DiscDrive("Seagate", "HDD", 32, 3.5f);
        return seagate;
    }
}
