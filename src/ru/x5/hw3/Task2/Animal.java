package ru.x5.hw3.Task2;

public class Animal {
    private String food;
    private String location;

    public String getFood() {
        return food;
    }
    public String getLocation() {
        return location;
    }

    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Животное шумит.");
    }
    public void eat(){
        System.out.println("Животное ест.");
    }
    public void sleep(){
        System.out.println("Животное спит.");
    }
}
