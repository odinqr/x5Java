package Lesson5.PC;

public class MonitorFactory {
    public Monitor createMonitor() {
        Monitor monitor = new Monitor("NEC", 21);
        return monitor;
    }
}
