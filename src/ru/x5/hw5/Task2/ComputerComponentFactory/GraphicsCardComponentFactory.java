package ru.x5.hw5.Task2.ComputerComponentFactory;

import ru.x5.hw5.Task2.ComputeComponent.GraphicsCard;
import ru.x5.hw5.Task2.ComputeComponent.СomputerComponent;
import ru.x5.hw5.Task2.ComputeComponent.СoolingType;
import ru.x5.hw5.Task2.CreateStrategy;

public class GraphicsCardComponentFactory extends ComputerComponentFactory {
    @Override
    public СomputerComponent pickFromWarehouse(CreateStrategy strategy) {
        switch (strategy) {
            case LOW:
                return new GraphicsCard("AMD","GDDR5",8, СoolingType.ACTIVE);
            case MEDIUM:
                return new GraphicsCard("Nvidia","GDDR5x",8, СoolingType.ACTIVE);
            case HIGH:
                return new GraphicsCard("Nvidia","GDDR6",10, СoolingType.ACTIVE);
            default:
                return new GraphicsCard();
        }
    }
}
