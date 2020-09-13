package ru.x5.hw3.Task2;

public class MainClass {
    public static void main(String[] args) {
        Animal [] animals = { new Dog("cобачий корм", "Перово", 10),
                new Cat("кошачий корм", "Измайлово", 10),
                new Horse("сено", "Дорохово", 9)};
        Veterinarian vet = new Veterinarian();
        for (Animal a : animals){
            vet.treatAnimal(a);
        }
    }
}