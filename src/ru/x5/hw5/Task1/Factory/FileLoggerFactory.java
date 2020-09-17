package ru.x5.hw5.Task1.Factory;

import ru.x5.hw5.Task1.Logger.FileLogger;
import ru.x5.hw5.Task1.Logger.Logger;

public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
