package ru.x5.hw5.Task1;

import ru.x5.hw5.Task1.Factory.ConsoleLoggerFactory;
import ru.x5.hw5.Task1.Factory.DbLoggerFactory;
import ru.x5.hw5.Task1.Factory.FileLoggerFactory;
import ru.x5.hw5.Task1.Factory.LoggerFactory;
import ru.x5.hw5.Task1.Logger.LoggerType;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Выберете тип логгера: ");
        System.out.println("1) ConsoleLogger");
        System.out.println("2) FileLogger");
        System.out.println("3) DbLogger");

        Scanner sc = new Scanner(System.in);
        LoggerType type = null;

        while (true) {
            try {
                type = LoggerType.valueOf(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Нет такого типа логгера.");
            }
        }
        LoggerFactory factory = null;
        switch (type) {
            case ConsoleLogger:
                factory = new ConsoleLoggerFactory();
                break;
            case FileLogger:
                factory = new FileLoggerFactory();
                break;
            case DbLogger:
                factory = new DbLoggerFactory();
        }

        Calculator calc = new Calculator(factory.createLogger());
        String expression = "";

        while (true) {
            System.out.println("Введите выражение:");
            expression = sc.nextLine();
            if (expression.equals("exit")){
                System.out.println("Работа звершена.");
                return;
            }
            try {
                calc.calculate(expression);

            } catch (Exception ex)
            {
                System.out.println("Ошибка: введите корректное выражение.");
            }
        }
    }
}
