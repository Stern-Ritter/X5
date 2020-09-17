package ru.x5.hw5.Task2.ComputeComponent;

import ru.x5.hw5.Task2.Computer;

public class Monitor implements СomputerComponent {
    private String manufacturer;
    private int diagonal;
    private String matrixType;

    public Monitor() {
    }

    public Monitor(String manufacturer, int diagonal, String matrixType) {
        this.manufacturer = manufacturer;
        this.diagonal = diagonal;
        this.matrixType = matrixType;
    }

    @Override
    public String toString() {
        return "Monitor{" + "manufacturer='" + manufacturer + '\'' + ", diagonal=" + diagonal +
                ", matrixType='" + matrixType + '\'' + '}';
    }

    @Override
    public void compleateIn(Computer comp) {
        comp.setMon(this);
    }
}
