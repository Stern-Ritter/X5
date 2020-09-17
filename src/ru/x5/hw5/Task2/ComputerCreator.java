package ru.x5.hw5.Task2;

import ru.x5.hw5.Task2.ComputerComponentFactory.*;

public class ComputerCreator {
    private static ComputerCreator instance;
    private CreateStrategy strategy;
    private CpuComponentFactory cpuFact;
    private RamComponentFactory ramFact;
    private GraphicsCardComponentFactory gpuFact;
    private StorageComponentFactory storageFact;
    private MonitorComponentFactory monFact;

    private ComputerCreator() {
        strategy = CreateStrategy.MEDIUM;
        cpuFact = new CpuComponentFactory();
        ramFact = new RamComponentFactory();
        gpuFact = new GraphicsCardComponentFactory();
        storageFact = new StorageComponentFactory();
        monFact = new MonitorComponentFactory();
    }

    public static ComputerCreator getInstance() {
        if (instance == null) {
            synchronized (ComputerCreator.class) {
                if (instance == null) {
                    instance = new ComputerCreator();
                }
            }
        }
        return instance;
    }

    public void setStrategy(CreateStrategy strategy) {
        this.strategy = strategy;
    }
    public Computer create() {
       Computer computer = new Computer();
       cpuFact.pickFromWarehouse(strategy).compleateIn(computer);
       ramFact.pickFromWarehouse(strategy).compleateIn(computer);
       gpuFact.pickFromWarehouse(strategy).compleateIn(computer);
       storageFact.pickFromWarehouse(strategy).compleateIn(computer);
       monFact.pickFromWarehouse(strategy).compleateIn(computer);
       return computer;
    }
}
