package ru.x5.hw3.Task2;

public class Horse extends Animal{
    private int hoofSize;

    public Horse(String food, String location, int hoofSize) {
        super(food, location);
        this.hoofSize = hoofSize;
    }

    @Override
    public void makeNoise(){
        System.out.println("Лошадь шумит.");
    }
    @Override
    public void eat(){
        System.out.println("Лошадь ест.");
    }
}
