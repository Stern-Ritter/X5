package ru.x5.hw4.Task2;

public class Engine {
    private int power;
    private String manufacturer;

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }
}
