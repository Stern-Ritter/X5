package ru.x5.hw5.Task2.ComputerComponentFactory;

import ru.x5.hw5.Task2.ComputeComponent.Monitor;
import ru.x5.hw5.Task2.ComputeComponent.СomputerComponent;
import ru.x5.hw5.Task2.CreateStrategy;

public class MonitorComponentFactory extends ComputerComponentFactory {
    @Override
    public СomputerComponent pickFromWarehouse(CreateStrategy strategy) {
        switch (strategy) {
            case LOW:
                return new Monitor("AOC", 24,"VA");
            case MEDIUM:
                return new Monitor("Samsung",27,"IPS");
            case HIGH:
                return new Monitor("Dell",32,"IPS");
            default:
                return new Monitor();
        }
    }
}
