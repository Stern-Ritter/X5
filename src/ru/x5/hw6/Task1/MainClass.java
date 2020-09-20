package ru.x5.hw6.Task1;

public class MainClass {
    public static void main(String[] args) {

        Box<Apple> firstAppleBox = new Box();
        Box<Apple> secondAppleBox = new Box();
        Box<Orange> firtsOrangeBox = new Box();
        Box<Orange> secondOrangeBox = new Box();

        for (int i = 0; i < 6; i++) {
            firstAppleBox.addFruit(new Apple());
            secondAppleBox.addFruit(new Apple());
        }

        for (int i = 0; i < 4 ; i++) {
            firtsOrangeBox.addFruit(new Orange());
            secondOrangeBox.addFruit(new Orange());
        }
        System.out.println(firstAppleBox.getWeigth());
        System.out.println(secondAppleBox.getWeigth());
        System.out.println(firtsOrangeBox.getWeigth());
        System.out.println(secondOrangeBox.getWeigth());

        System.out.println(firstAppleBox.compare(secondAppleBox));
        System.out.println(firtsOrangeBox.compare(secondOrangeBox));
        System.out.println(firstAppleBox.compare(firtsOrangeBox));
        System.out.println(secondAppleBox.compare(secondOrangeBox));

        firstAppleBox.moveTo(secondAppleBox);
        firtsOrangeBox.moveTo(secondOrangeBox);

        System.out.println(firstAppleBox.getWeigth());
        System.out.println(secondAppleBox.getWeigth());
        System.out.println(firtsOrangeBox.getWeigth());
        System.out.println(secondOrangeBox.getWeigth());

        System.out.println(firstAppleBox.compare(secondAppleBox));
        System.out.println(firtsOrangeBox.compare(secondOrangeBox));
        System.out.println(firstAppleBox.compare(firtsOrangeBox));
        System.out.println(secondAppleBox.compare(secondOrangeBox));

    }
}
