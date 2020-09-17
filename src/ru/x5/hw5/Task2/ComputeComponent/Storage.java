package ru.x5.hw5.Task2.ComputeComponent;

import ru.x5.hw5.Task2.Computer;

public class Storage implements СomputerComponent {
    private String manufacturer;
    private int memorySize;
    private StorageType storageType;
    private String formFactor;

    public Storage() {
    }

    public Storage(String manufacturer, int memorySize, StorageType storageType, String formFactor) {
        this.manufacturer = manufacturer;
        this.memorySize = memorySize;
        this.storageType = storageType;
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "Storage{" + "manufacturer='" + manufacturer + '\'' + ", memorySize=" + memorySize +
                ", storageType=" + storageType + ", formFactor='" + formFactor + '\'' + '}';
    }

    @Override
    public void compleateIn(Computer comp) {
        comp.setStorage(this);
    }
}
