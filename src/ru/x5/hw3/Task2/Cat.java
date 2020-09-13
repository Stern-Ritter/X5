package ru.x5.hw3.Task2;

public class Cat extends Animal{
    private int noiselessLevel;

    public Cat(String food, String location, int noiselessLevel) {
        super(food, location);
        this.noiselessLevel = noiselessLevel;
    }

    @Override
    public void makeNoise(){
        System.out.println("Кошка шумит.");
    }
    @Override
    public void eat(){
        System.out.println("Кошка ест.");
    }
}
