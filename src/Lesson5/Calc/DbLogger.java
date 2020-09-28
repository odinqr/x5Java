package Lesson5.Calc;

public class DbLogger implements LoggerMessage{
    @Override
    public String log(String message) {
        return "DbLogger - Log into database: ";
    }
}
