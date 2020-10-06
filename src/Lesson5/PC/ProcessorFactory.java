package Lesson5.PC;

public class ProcessorFactory {
    public Processor createProcessor() {
        Processor processor = new Processor(3100, 2, 4096, "INTEL", "Pentium");
        return processor;
    }
}
