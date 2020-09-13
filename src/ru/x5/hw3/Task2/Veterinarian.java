package ru.x5.hw3.Task2;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.printf("Еда: %s, Местонахождение: %s.\n", animal.getFood(), animal.getLocation());
    }
}
