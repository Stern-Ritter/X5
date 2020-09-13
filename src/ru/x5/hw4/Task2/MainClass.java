package ru.x5.hw4.Task2;

public class MainClass {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new Lorry("КамАЗ-5410", "Грузовой", 7.4, new Engine(240, "V8"), 3.0);
        cars[1] = new SportCar("Ford Mustang", "S", 1.9, new Engine(210, "V6"), 190 );
        for (Car car : cars){
            car.start();
            car.turnLeft();
            car.turnRight();
            car.stop();
            car.printInfo();
        }
    }
}
