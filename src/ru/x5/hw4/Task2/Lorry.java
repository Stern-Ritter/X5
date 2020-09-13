package ru.x5.hw4.Task2;

public class Lorry extends Car{
    private double loadCapacity;

    public Lorry(String mark, String category, double weight, Engine engine, double loadCapacity) {
        super(mark, category, weight, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал.");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился.");
    }

    @Override
    public void printInfo() {
            System.out.printf("Марка : %s, Класс: %s, Вес: %.2f, Мощность мотора: %d, Производитель мотора: %s," +
                    " Грузоподъемность: %.2f.\n", getMark(), getCategory(), getWeight(), getEngine().getPower(),
                    getEngine().getManufacturer(), loadCapacity);
    }
}
