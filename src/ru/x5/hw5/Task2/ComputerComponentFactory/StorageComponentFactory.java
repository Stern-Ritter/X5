package ru.x5.hw5.Task2.ComputerComponentFactory;

import ru.x5.hw5.Task2.ComputeComponent.Storage;
import ru.x5.hw5.Task2.ComputeComponent.StorageType;
import ru.x5.hw5.Task2.ComputeComponent.СomputerComponent;
import ru.x5.hw5.Task2.CreateStrategy;

public class StorageComponentFactory extends ComputerComponentFactory {
    @Override
    public СomputerComponent pickFromWarehouse(CreateStrategy strategy) {
        switch (strategy) {
            case LOW:
                return new Storage("SmartBuy", 128, StorageType.SSD," M.2");
            case MEDIUM:
                return new Storage("Transcend",256,StorageType.SSD," M.2");
            case HIGH:
                return new Storage("Samsung",512,StorageType.SSD,"2.5");
            default:
                return new Storage();
        }
    }
}
