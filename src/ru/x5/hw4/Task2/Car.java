package ru.x5.hw4.Task2;

public abstract class Car {
    private String mark;
    private String category;
    private double weight;
    private Engine engine;

    public String getMark() {
        return mark;
    }

    public String getCategory() {
        return category;
    }

    public double getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car(String mark, String category, double weight, Engine engine) {
        this.mark = mark;
        this.category = category;
        this.weight = weight;
        this.engine = engine;
    }

    public abstract void start();
    public abstract void stop();
    public void turnRight(){
        System.out.println("Поворот направо.");
    }
    public void turnLeft(){
        System.out.println("Поворот налево.");
    }
    public abstract void printInfo();

}
