package ru.x5.hw5.Task2.ComputeComponent;

import ru.x5.hw5.Task2.Computer;

public class Ram implements СomputerComponent {
    private String manufacturer;
    private int memorySize;
    private int memoryFrequency;
    private String memoryType;

    public Ram() {
    }

    public Ram(String manufacturer, int memorySize, int memoryFrequency, String memoryType) {
        this.manufacturer = manufacturer;
        this.memorySize = memorySize;
        this.memoryFrequency = memoryFrequency;
        this.memoryType = memoryType;
    }

    @Override
    public String toString() {
        return "Ram{" + "manufacturer='" + manufacturer + '\'' + ", memorySize=" + memorySize +
                ", memoryFrequency=" + memoryFrequency + ", memoryType='" + memoryType + '\'' + '}';
    }

    @Override
    public void compleateIn(Computer comp) {
        comp.setRam(this);
    }
}
