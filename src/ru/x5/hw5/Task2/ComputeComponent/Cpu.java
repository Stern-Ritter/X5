package ru.x5.hw5.Task2.ComputeComponent;

import ru.x5.hw5.Task2.Computer;

public class Cpu implements СomputerComponent {
    private int clockRate;
    private int cores;
    private int memoryCashe;
    private String name;
    private String manufacturer;

    public Cpu() {
    }

    public Cpu(int clockRate, int cores, int memoryCashe, String name, String manufacturer) {
        this.clockRate = clockRate;
        this.cores = cores;
        this.memoryCashe = memoryCashe;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Cpu{" + "clockRate=" + clockRate + ", cores=" + cores + ", memoryCashe=" + memoryCashe +
                ", name='" + name + '\'' + ", manufacturer='" + manufacturer + '\'' +'}';
    }

    @Override
    public void compleateIn(Computer comp) {
        comp.setCpu(this);
    }
}
