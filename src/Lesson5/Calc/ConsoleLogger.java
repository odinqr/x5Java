package Lesson5.Calc;

public class ConsoleLogger implements LoggerMessage{
    @Override
    public String log(String message) {
        return "ConsoleLogger - Log into console: ";
    }
}
