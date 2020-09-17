package ru.x5.hw5.Task2.ComputeComponent;

import ru.x5.hw5.Task2.Computer;

public class GraphicsCard implements СomputerComponent {
    private String manufacturer;
    private String memoryType;
    private int memorySize;
    private СoolingType cooling;

    public GraphicsCard() {
    }

    public GraphicsCard(String manufacturer, String memoryType, int memorySize, СoolingType cooling) {
        this.manufacturer = manufacturer;
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        this.cooling = cooling;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" + "manufacturer='" + manufacturer + '\'' + ", memoryType='" + memoryType + '\'' +
                ", memorySize=" + memorySize + ", cooling=" + cooling + '}';
    }

    @Override
    public void compleateIn(Computer comp) {
        comp.setGpu(this);
    }
}
