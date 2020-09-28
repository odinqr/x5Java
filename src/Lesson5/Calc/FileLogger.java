package Lesson5.Calc;

public class FileLogger implements LoggerMessage{
    @Override
    public String log(String message) {
        return "FileLogger - Log into file: ";
    }
}
