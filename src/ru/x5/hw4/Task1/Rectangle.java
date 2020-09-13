package ru.x5.hw4.Task1;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double square(){
        return a * b;
    }
}
