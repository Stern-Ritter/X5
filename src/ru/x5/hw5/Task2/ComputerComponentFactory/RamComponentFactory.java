package ru.x5.hw5.Task2.ComputerComponentFactory;

import ru.x5.hw5.Task2.ComputeComponent.Ram;
import ru.x5.hw5.Task2.ComputeComponent.СomputerComponent;
import ru.x5.hw5.Task2.CreateStrategy;

public class RamComponentFactory extends ComputerComponentFactory {
    @Override
    public СomputerComponent pickFromWarehouse(CreateStrategy strategy) {
        switch (strategy) {
            case LOW:
                return new Ram("Patriot", 16,2400,"DDR4");
            case MEDIUM:
                return new Ram("Kingston",32,2666,"DDR4");
            case HIGH:
                return new Ram("Samsung",64,3200,"DDR4");
            default:
                return new Ram();
        }
    }
}
