package ru.x5.hw5.Task1.Factory;

import ru.x5.hw5.Task1.Logger.DbLogger;
import ru.x5.hw5.Task1.Logger.Logger;

public class DbLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DbLogger();
    }
}
