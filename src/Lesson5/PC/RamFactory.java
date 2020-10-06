package Lesson5.PC;

public class RamFactory {
    public Ram createRam() {
        Ram kingston = new Ram("Kingston", 4096);
        return kingston;
    }
}
