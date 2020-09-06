package ru.x5.hw3;


public class Task_2 {
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

class Animal {
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

class Dog extends Animal{
    int loyaltyLevel;

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

class Cat extends Animal{
    int noiselessLevel;

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

class Horse extends Animal{
    int hoofSize;

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

class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.printf("Еда: %s, Местонахождение: %s.\n", animal.getFood(), animal.getLocation());
    }
}

