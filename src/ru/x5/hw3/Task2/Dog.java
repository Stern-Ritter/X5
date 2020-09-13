package ru.x5.hw3.Task2;

public class Dog extends Animal{
    private int loyaltyLevel;

    public Dog(String food, String location, int loyaltyLevel) {
        super(food, location);
        this.loyaltyLevel = loyaltyLevel;
    }

    @Override
    public void makeNoise(){
        System.out.println("Собака шумит.");
    }
    @Override
    public void eat(){
        System.out.println("Собака ест.");
    }
}
