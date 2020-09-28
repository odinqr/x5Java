package Lesson5.Calc;

import java.util.logging.Logger;

public class LoggerFactory {
    public Logger getLogger(LoggerType type) {
            switch (type) {
                case DbLogger:
                    getLogger(LoggerType.DbLogger);
                case FileLogger:
                    getLogger(LoggerType.FileLogger);
                case ConsoleLogger:
                    getLogger(LoggerType.ConsoleLogger);
                default:
                return null;
            }
    }


}

