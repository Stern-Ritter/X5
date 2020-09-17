package ru.x5.hw5.Task1.Factory;

import ru.x5.hw5.Task1.Logger.ConsoleLogger;
import ru.x5.hw5.Task1.Logger.Logger;

public class ConsoleLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
