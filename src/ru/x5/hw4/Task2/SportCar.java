package ru.x5.hw4.Task2;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String mark, String category, double weight, Engine engine, int maxSpeed) {
        super(mark, category, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("Спорткар поехал.");
    }

    @Override
    public void stop() {
        System.out.println("Спорткар остановился.");
    }

    @Override
    public void printInfo() {
            System.out.printf("Марка : %s, Класс: %s, Вес: %.2f, Мощность мотора: %d, Производитель мотора: %s," +
                            " Максимальная скорость: %d.\n", getMark(), getCategory(), getWeight(), getEngine().getPower(),
                            getEngine().getManufacturer(), maxSpeed);
    }
}
