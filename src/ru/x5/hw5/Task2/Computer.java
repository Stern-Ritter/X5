package ru.x5.hw5.Task2;

import ru.x5.hw5.Task2.ComputeComponent.*;

public class Computer {
    private Cpu cpu;
    private Ram ram;
    private GraphicsCard gpu;
    private Storage storage;
    private Monitor mon;

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setGpu(GraphicsCard gpu) {
        this.gpu = gpu;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setMon(Monitor mon) {
        this.mon = mon;
    }

    public void getDescription(){
        System.out.println("Спецификация компьютера: ");
        System.out.println(cpu);
        System.out.println(ram);
        System.out.println(gpu);
        System.out.println(storage);
        System.out.println(mon);
    }
}
