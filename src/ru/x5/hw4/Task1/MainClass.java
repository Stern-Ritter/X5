package ru.x5.hw4.Task1;

public class MainClass {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Triangle(2, 3, 3);
        shapes[2] = new Rectangle(5,5);
        for (Shape sh : shapes){
            System.out.printf("Площадь фигуры: %.2f.\n", sh.square());
        }
    }
}
