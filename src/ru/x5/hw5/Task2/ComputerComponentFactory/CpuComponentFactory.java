package ru.x5.hw5.Task2.ComputerComponentFactory;

import ru.x5.hw5.Task2.ComputeComponent.Cpu;
import ru.x5.hw5.Task2.ComputeComponent.СomputerComponent;
import ru.x5.hw5.Task2.CreateStrategy;

public class CpuComponentFactory extends ComputerComponentFactory {
    @Override
    public СomputerComponent pickFromWarehouse(CreateStrategy strategy) {
        switch (strategy) {
            case LOW:
                return new Cpu(2900, 2,4,"i3","Intel");
            case MEDIUM:
                return new Cpu(3600,4,8,"i5", "Intel");
            case HIGH:
                return new Cpu(3900,8,16,"i7", "Intel");
            default:
                return new Cpu();
        }
    }
}
