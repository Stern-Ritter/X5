package ru.x5.hw5.Task2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите характеристики для компьютера:");
        System.out.println("1) LOW");
        System.out.println("2) MEDIUM");
        System.out.println("3) HIGH");

        CreateStrategy strategy = null;
        while (true) {
            try {
                strategy = CreateStrategy.valueOf(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Нет такого типа характеристик.");
            }
        }
        ComputerCreator creator = ComputerCreator.getInstance();
        creator.setStrategy(strategy);
        Computer computer = creator.create();
        computer.getDescription();
    }
}
