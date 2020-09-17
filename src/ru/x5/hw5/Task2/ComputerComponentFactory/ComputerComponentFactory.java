package ru.x5.hw5.Task2.ComputerComponentFactory;

import ru.x5.hw5.Task2.ComputeComponent.СomputerComponent;
import ru.x5.hw5.Task2.CreateStrategy;

public abstract class ComputerComponentFactory {
    public abstract СomputerComponent pickFromWarehouse(CreateStrategy strategy);
}
