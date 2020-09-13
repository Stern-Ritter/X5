package ru.x5.hw3.Task1;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String nameCall) {
        System.out.printf("Звонит %s.\n", nameCall);
    }

    public void receiveCall(String nameCall, int numberCall) {
        System.out.printf("Звонит Имя: %s, Номер: %s.\n", nameCall, numberCall);
    }

    public void sendMessage(int... arr) {
        for (int number : arr) {
            System.out.println(number);
        }
    }
}